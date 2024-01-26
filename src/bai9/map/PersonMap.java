package bai9.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonMap {
    public static void main(String[] args) {
//        Viết ctrinh cho phéo lwuu trư cmnd
//                vaf tên của người sở hữu . chương trrinhcosos những tính năng sau
//
//                1 thm thông tin người dùng (cmnd+ tên)
//        2 in ra thong tin người dùng
//                3.cập nhật tên người dùng theo số cmnd
//                4. Xóa thông tin người dùng ra khỏi tập họp
//                5. Truy xuất tên ngời dung thông qua ố cmnd
//                6. kiem tra xem cmnd 123673 có tồn tại trong tập hợp hay không
//                 nếu tồn tại thì in ra thông tin ,
//        không thì message---> khong tồn tại số CMND nay

        Map<Integer, String> CMND = new HashMap<>();
        CMND.put(446574, "Nguyen Thi B");
        CMND.put(257255, "Tran Van D");
        CMND.put(635964, "Banh thi H");
        CMND.put(444865, "Hoang Tran D");
        CMND.put(448899, "Nguyen Hoang E");

        System.out.println(CMND);

        Set<Integer> KeyCMND = CMND.keySet();

//        3.update

        System.out.println("--------info after update--------");
        CMND.replace(448899, "Nguyen Hoang E_update");
        System.out.println(CMND);



//        4. xoa thong tin
        CMND.remove(444865);
//        5. truy xuat
//        boolean CMND






    }
}
