package org.openquantumsafe;

public class Common {
    
    public static <E, T extends Iterable<E>> void print_list(T list) {
        for (Object element : list){
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String chopHex(byte[] bytes) {
        final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder();
        int num = 8;
        for (int i = 0; i < num; i++) {
            int v = bytes[i] & 0xFF;
            sb.append(HEX_ARRAY[v >>> 4]);
            sb.append(HEX_ARRAY[v & 0x0F]);
            sb.append(" ");
        }
        if (bytes.length > num*2) {
            sb.append("... ");
        }
        for (int i = bytes.length - num; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            sb.append(HEX_ARRAY[v >>> 4]);
            sb.append(HEX_ARRAY[v & 0x0F]);
            sb.append(" ");
        }
        return sb.toString();
    }

}