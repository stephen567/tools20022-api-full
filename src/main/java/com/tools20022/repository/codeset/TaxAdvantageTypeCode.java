/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code for the form of tax advantage on the dividend.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode#ConcessionalGST
 * TaxAdvantageTypeCode.ConcessionalGST}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode#NotApplicable
 * TaxAdvantageTypeCode.NotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode#NotAvailable
 * TaxAdvantageTypeCode.NotAvailable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode#Other
 * TaxAdvantageTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode#PooledDevelopmentFundRebta
 * TaxAdvantageTypeCode.PooledDevelopmentFundRebta}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code
 * TaxAdvantageType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxAdvantageTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code for the form of tax advantage on the dividend."</li>
 * </ul>
 */
public class TaxAdvantageTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax advantage type is: Concessional Goods and Services Tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode
	 * TaxAdvantageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CGST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcessionalGST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax advantage type is: Concessional Goods and Services Tax."</li>
	 * </ul>
	 */
	public static final MMCode ConcessionalGST = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcessionalGST";
			definition = "Tax advantage type is: Concessional Goods and Services Tax.";
			owner_lazy = () -> TaxAdvantageTypeCode.mmObject();
			codeName = "CGST";
		}
	};
	/**
	 * Tax advantage type is not applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode
	 * TaxAdvantageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage type is not applicable."</li>
	 * </ul>
	 */
	public static final MMCode NotApplicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			definition = "Tax advantage type is not applicable.";
			owner_lazy = () -> TaxAdvantageTypeCode.mmObject();
			codeName = "NOAP";
		}
	};
	/**
	 * Tax advantage type is not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode
	 * TaxAdvantageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage type is not available."</li>
	 * </ul>
	 */
	public static final MMCode NotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			definition = "Tax advantage type is not available.";
			owner_lazy = () -> TaxAdvantageTypeCode.mmObject();
			codeName = "NOAV";
		}
	};
	/**
	 * Other type of tax advantage type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode
	 * TaxAdvantageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of tax advantage type."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other type of tax advantage type.";
			owner_lazy = () -> TaxAdvantageTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Tax advantage type is: pooled development fund Rebta.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageTypeCode
	 * TaxAdvantageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PooledDevelopmentFundRebta"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage type is: pooled development fund Rebta."</li>
	 * </ul>
	 */
	public static final MMCode PooledDevelopmentFundRebta = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PooledDevelopmentFundRebta";
			definition = "Tax advantage type is: pooled development fund Rebta.";
			owner_lazy = () -> TaxAdvantageTypeCode.mmObject();
			codeName = "PDFR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxAdvantageTypeCode";
				definition = "Code for the form of tax advantage on the dividend.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxAdvantageTypeCode.ConcessionalGST, com.tools20022.repository.codeset.TaxAdvantageTypeCode.NotApplicable,
						com.tools20022.repository.codeset.TaxAdvantageTypeCode.NotAvailable, com.tools20022.repository.codeset.TaxAdvantageTypeCode.Other, com.tools20022.repository.codeset.TaxAdvantageTypeCode.PooledDevelopmentFundRebta);
				derivation_lazy = () -> Arrays.asList(TaxAdvantageType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}