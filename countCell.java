/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 */
public class countCell {

    HashMap pixel;
    ArrayList al;
    ArrayList wbcal;
    private int wbc;
    private int cellcount;

 
    public void countCell(byte[][] data) {
        pixel = new HashMap();
        wbcal = new ArrayList();
        al = new ArrayList();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 1) {
                    String key = i + "," + j;
                    if (pixel.get(key) == null) {
                        if (i >= 1 && j >= 1 && i < data.length - 1 && j < data[i].length - 1) {
                            System.out.println("find " + i + "," + j);
                            findNeburRing(data, i, j);
                        }
                    }
                }
            }
        }
        ArrayList alcell = new ArrayList();
        boolean flag[] = new boolean[al.size()];
        for (int i = 0; i < al.size(); i++) {
            PixcelRing obj = (PixcelRing) al.get(i);
            int cnt = 0;
            for (int j = 0; j < al.size(); j++) {
                PixcelRing obj1 = (PixcelRing) al.get(j);
                if (i != j) {
                    if (obj.minx <= obj1.minx && obj.miny <= obj1.miny &&
                            obj.maxx >= obj1.maxx &&
                            obj.maxy >= obj1.maxy) {
                        if (obj.getType() == 1) {
//                            wbcal.add(obj);
//                            alcell.add(obj);
                            cnt++;
                            //    al.remove(j);
                        } else {
//                            alcell.add(obj);
                            // al.remove(j);
                        }
                        // flag[j] = true;
                        //flag[i] = true;
                    }

                }

            }
            if (cnt == 1) {
                wbcal.add(obj);
            }
            alcell.add(obj);
        }


        setWbc(wbcal.size());
        setCellcount(alcell.size());
    }

    public void findNeburRing(byte[][] data, int x, int y) {
        HashMap hs = new HashMap();

        byte mt[][] = new byte[3][3];
        hs.put(x + "," + y, x + "," + y);
        pixel.put(x + "," + y, x + "," + y);
        PixcelRing obj = new PixcelRing();
        obj.setMaxx(x);
        obj.setMinx(x);
        obj.setMaxy(y);
        obj.setMiny(y);
        boolean circle = false;
        while (true) {

            mt[0][0] = data[x - 1][y - 1];
            mt[0][1] = data[x][y - 1];
            mt[0][2] = data[x + 1][y - 1];

            mt[1][0] = data[x - 1][y];
            mt[1][1] = data[x][y];
            mt[1][2] = data[x + 1][y];

            mt[2][0] = data[x - 1][y + 1];
            mt[2][1] = data[x][y + 1];
            mt[2][2] = data[x + 1][y + 1];
            boolean flag = false;
            int cnt = 0;
            for (int i = 0; i < mt.length; i++) {

                for (int j = 0; j < mt[i].length; j++) {
                    int x1 = x - 1 + i;
                    int y1 = y - 1 + j;

                    if (mt[i][j] == 1 && hs.get(x1 + "," + y1) == null) {
                        flag = true;

                        if (x1 < obj.getMinx()) {
                            obj.setMinx(x1);
                        }

                        if (y1 < obj.getMiny()) {
                            obj.setMiny(y1);
                        }
                        if (x1 > obj.getMaxx()) {
                            obj.setMaxx(x1);
                        }
                        if (y1 > obj.getMaxy()) {
                            obj.setMaxy(y1);
                        }
                        hs.put(x1 + "," + y1, x1 + "," + y1);
                        pixel.put(x1 + "," + y1, x1 + "," + y1);
                        x = x1;
                        y = y1;
                        break;

                    } else if (hs.get(x1 + "," + y1) != null) {
                        cnt++;
                    }

                }
                if (cnt == 2) {
                    circle = true;
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

        if (hs.size() > 20) {
            obj.setHs(hs);
            if (circle) {
                obj.setType(1);

            }
            al.add(obj);
        }
    }

    /**
     * @return the wbc
     */
    public int getWbc() {
        return wbc;
    }

    /**
     * @param wbc the wbc to set
     */
    public void setWbc(int wbc) {
        this.wbc = wbc;
    }

    /**
     * @return the cellcount
     */
    public int getCellcount() {
        return cellcount;
    }

    /**
     * @param cellcount the cellcount to set
     */
    public void setCellcount(int cellcount) {
        this.cellcount = cellcount;
    }
}
