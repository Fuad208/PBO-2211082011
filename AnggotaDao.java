/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B.Model;
import java.util.*;
/**
 *
 * @author TI 10
 */
public interface AnggotaDao {
    public interface AnggotaDao {
    Anggota save(Anggota anggota);
    Anggota update(int index,Anggota anggota);
    void delete (int index);
    Anggota getAnggota(int index);
    List<Anggota> getAllAnggota();
}
