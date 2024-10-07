class Solution {
    public int compareVersion(String version1, String version2) {

        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int i = 0, j;

        int[] v1 = new int[ver1.length];
        for(String str : ver1) {
            v1[i] = Integer.parseInt(str);
            i++;
        }
        i = 0;
        int[] v2 = new int[ver2.length];
        for(String str : ver2) {
            v2[i] = Integer.parseInt(str);
            i++;
        }

        i = 0;
        j = 0;

        while(i < v1.length && i < v2.length) {
            if(v1[i] > v2[i]) return 1;
            else if(v1[i] < v2[i]) return -1;
            i++;
        }
        while(i < v1.length) {
            if(v1[i] != 0) return 1;
            i++;
        }
        while(i < v2.length) {
            if(v2[i] != 0) return -1;
            i++;
        }
        return 0;
    }
}
