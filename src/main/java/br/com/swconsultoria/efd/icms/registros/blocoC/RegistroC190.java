/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
@EqualsAndHashCode
public class RegistroC190 {

    private final String reg = "C190";
    private String cst_icms;
    private String cfop;
    private String aliq_icms;
    private String vl_opr;
    private String vl_bc_icms;
    private String vl_icms;
    private String vl_bc_icms_st;
    private String vl_icms_st;
    private String vl_red_bc;
    private String vl_ipi;
    private String cod_obs;

    private RegistroC191 registroC191;

    /**
     * @return the cst_icms
     */
    public String getCst_icms() {
        return cst_icms;
    }

    /**
     * @param cst_icms the cst_icms to set
     */
    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    /**
     * @return the cfop
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * @param cfop the cfop to set
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    /**
     * @return the aliq_icms
     */
    public String getAliq_icms() {
        return aliq_icms;
    }

    /**
     * @param aliq_icms the aliq_icms to set
     */
    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    /**
     * @return the vl_opr
     */
    public String getVl_opr() {
        return vl_opr;
    }

    /**
     * @param vl_opr the vl_opr to set
     */
    public void setVl_opr(String vl_opr) {
        this.vl_opr = vl_opr;
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
     * @return the vl_bc_icms_st
     */
    public String getVl_bc_icms_st() {
        return vl_bc_icms_st;
    }

    /**
     * @param vl_bc_icms_st the vl_bc_icms_st to set
     */
    public void setVl_bc_icms_st(String vl_bc_icms_st) {
        this.vl_bc_icms_st = vl_bc_icms_st;
    }

    /**
     * @return the vl_icms_st
     */
    public String getVl_icms_st() {
        return vl_icms_st;
    }

    /**
     * @param vl_icms_st the vl_icms_st to set
     */
    public void setVl_icms_st(String vl_icms_st) {
        this.vl_icms_st = vl_icms_st;
    }

    /**
     * @return the vl_red_bc
     */
    public String getVl_red_bc() {
        return vl_red_bc;
    }

    /**
     * @param vl_red_bc the vl_red_bc to set
     */
    public void setVl_red_bc(String vl_red_bc) {
        this.vl_red_bc = vl_red_bc;
    }

    /**
     * @return the vl_ipi
     */
    public String getVl_ipi() {
        return vl_ipi;
    }

    /**
     * @param vl_ipi the vl_ipi to set
     */
    public void setVl_ipi(String vl_ipi) {
        this.vl_ipi = vl_ipi;
    }

    /**
     * @return the cod_obs
     */
    public String getCod_obs() {
        return cod_obs;
    }

    /**
     * @param cod_obs the cod_obs to set
     */
    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC191
     */
    public RegistroC191 getRegistroC191() {
        return registroC191;
    }

    /**
     * @param registroC191 the registroC191 to set
     */
    public void setRegistroC191(RegistroC191 registroC191) {
        this.registroC191 = registroC191;
    }

}
