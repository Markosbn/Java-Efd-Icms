/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroD500 {

    private final String reg = "D500";
    private String ind_oper;
    private String ind_emit;
    private String cod_part;
    private String cod_mod;
    private String cod_sit;
    private String ser;
    private String sub;
    private String num_doc;
    private String dt_doc;
    private String dt_a_p;
    private String vl_doc;
    private String vl_desc;
    private String vl_serv;
    private String vl_serv_nt;
    private String vl_terc;
    private String vl_da;
    private String vl_bc_icms;
    private String vl_icms;
    private String cod_inf;
    private String vl_pis;
    private String vl_cofins;
    private String cod_cta;
    private String tp_assinante;
    private List<RegistroD510> registroD510;
    private List<RegistroD530> registroD530;
    private List<RegistroD590> registroD590;

    /**
     * @return the ind_oper
     */
    public String getInd_oper() {
        return ind_oper;
    }

    /**
     * @param ind_oper the ind_oper to set
     */
    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
    }

    /**
     * @return the ind_emit
     */
    public String getInd_emit() {
        return ind_emit;
    }

    /**
     * @param ind_emit the ind_emit to set
     */
    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
    }

    /**
     * @return the cod_part
     */
    public String getCod_part() {
        return cod_part;
    }

    /**
     * @param cod_part the cod_part to set
     */
    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    /**
     * @return the cod_mod
     */
    public String getCod_mod() {
        return cod_mod;
    }

    /**
     * @param cod_mod the cod_mod to set
     */
    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    /**
     * @return the cod_sit
     */
    public String getCod_sit() {
        return cod_sit;
    }

    /**
     * @param cod_sit the cod_sit to set
     */
    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
    }

    /**
     * @return the ser
     */
    public String getSer() {
        return ser;
    }

    /**
     * @param ser the ser to set
     */
    public void setSer(String ser) {
        this.ser = ser;
    }

    /**
     * @return the sub
     */
    public String getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

    /**
     * @return the num_doc
     */
    public String getNum_doc() {
        return num_doc;
    }

    /**
     * @param num_doc the num_doc to set
     */
    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    /**
     * @return the dt_doc
     */
    public String getDt_doc() {
        return dt_doc;
    }

    /**
     * @param dt_doc the dt_doc to set
     */
    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    /**
     * @return the dt_a_p
     */
    public String getDt_a_p() {
        return dt_a_p;
    }

    /**
     * @param dt_a_p the dt_a_p to set
     */
    public void setDt_a_p(String dt_a_p) {
        this.dt_a_p = dt_a_p;
    }

    /**
     * @return the vl_doc
     */
    public String getVl_doc() {
        return vl_doc;
    }

    /**
     * @param vl_doc the vl_doc to set
     */
    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    /**
     * @return the vl_desc
     */
    public String getVl_desc() {
        return vl_desc;
    }

    /**
     * @param vl_desc the vl_desc to set
     */
    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    /**
     * @return the vl_serv
     */
    public String getVl_serv() {
        return vl_serv;
    }

    /**
     * @param vl_serv the vl_serv to set
     */
    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    /**
     * @return the vl_serv_nt
     */
    public String getVl_serv_nt() {
        return vl_serv_nt;
    }

    /**
     * @param vl_serv_nt the vl_serv_nt to set
     */
    public void setVl_serv_nt(String vl_serv_nt) {
        this.vl_serv_nt = vl_serv_nt;
    }

    /**
     * @return the vl_terc
     */
    public String getVl_terc() {
        return vl_terc;
    }

    /**
     * @param vl_terc the vl_terc to set
     */
    public void setVl_terc(String vl_terc) {
        this.vl_terc = vl_terc;
    }

    /**
     * @return the vl_da
     */
    public String getVl_da() {
        return vl_da;
    }

    /**
     * @param vl_da the vl_da to set
     */
    public void setVl_da(String vl_da) {
        this.vl_da = vl_da;
    }

    /**
     * @return the vl_bc_icms
     */
    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    /**
     * @param vl_bc_icms the vl_bc_icms to set
     */
    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    /**
     * @return the vl_icms
     */
    public String getVl_icms() {
        return vl_icms;
    }

    /**
     * @param vl_icms the vl_icms to set
     */
    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    /**
     * @return the cod_inf
     */
    public String getCod_inf() {
        return cod_inf;
    }

    /**
     * @param cod_inf the cod_inf to set
     */
    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
    }

    /**
     * @return the vl_pis
     */
    public String getVl_pis() {
        return vl_pis;
    }

    /**
     * @param vl_pis the vl_pis to set
     */
    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    /**
     * @return the vl_cofins
     */
    public String getVl_cofins() {
        return vl_cofins;
    }

    /**
     * @param vl_cofins the vl_cofins to set
     */
    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    /**
     * @return the cod_cta
     */
    public String getCod_cta() {
        return cod_cta;
    }

    /**
     * @param cod_cta the cod_cta to set
     */
    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    /**
     * @return the tp_assinante
     */
    public String getTp_assinante() {
        return tp_assinante;
    }

    /**
     * @param tp_assinante the tp_assinante to set
     */
    public void setTp_assiante(String tp_assinante) {
        this.tp_assinante = tp_assinante;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroD510
     */
    public List<RegistroD510> getRegistroD510() {
        if (registroD510 == null) {
            registroD510 = new ArrayList<RegistroD510>();
        }
        return registroD510;
    }

    /**
     * @return the registroD530
     */
    public List<RegistroD530> getRegistroD530() {
        if (registroD530 == null) {
            registroD530 = new ArrayList<RegistroD530>();
        }
        return registroD530;
    }

    /**
     * @return the registroD590
     */
    public List<RegistroD590> getRegistroD590() {
        if (registroD590 == null) {
            registroD590 = new ArrayList<RegistroD590>();
        }
        return registroD590;
    }

}
