/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoG;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoG.RegistroG130;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroG130 {

    public static StringBuilder gerar(EfdIcms efdIcms, RegistroG130 registroG130, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroG130.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroG130.getInd_emit()));
        sb.append("|").append(Util.preencheRegistro(registroG130.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroG130.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroG130.getSerie()));
        sb.append("|").append(Util.preencheRegistro(registroG130.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroG130.getChv_nfe_cte()));
        sb.append("|").append(Util.preencheRegistro(registroG130.getDt_doc()));
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            sb.append("|").append(Util.preencheRegistro(registroG130.getNum_da()));
        }
        sb.append("|").append('\n');

        return sb;
    }
}
