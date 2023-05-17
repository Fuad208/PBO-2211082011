/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B.controller;
import UTS_B.Model.Anggota;
import UTS_B.Model.AnggotaDao;
import UTS_B.Model.AnggotaDaoImpl;
import UTS_B.view.FormAnggota;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AnggotaController {

    private FormAnggota formAnggota;
    private AnggotaDao anggotaDao;

    public AnggotaController(FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }

    public void saveAnggota() {
        Anggota anggota = new Anggota();
        anggota.setPesanan(formAnggota.getTxtPesanan().getText());
        anggota.setPemesan(formAnggota.getTxtPemesan().getText());
        anggota.setTgl_Pesan(formAnggota.getTxtTgl_Pesan().getText());
        anggota.setHarga(formAnggota.getTxtHarga().getText());
        anggota.setOngkir(formAnggota.getTxtOngkir().getText());
        anggota.setDiskon(formAnggota.getTxtDiskon().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert Ok");
    }

    public void tampil() {
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();

        for (Anggota anggota : list) {
            Object row[] = {anggota.getPesanan(), anggota.getPemesan(), anggota.getTgl_Pesan, anggota.getHarga, anggota.getOngkir, anggota.getDiskon()};
            tabelModel.addRow(row);
        }
    }
}
/**
 *
 * @author TI 10
 */
public class AnggotaController {
    
}
