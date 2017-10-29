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
 * Specifies the type of trade certificate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Analysis
 * TradeCertificateTypeCode.Analysis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Quality
 * TradeCertificateTypeCode.Quality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Quantity
 * TradeCertificateTypeCode.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Weight
 * TradeCertificateTypeCode.Weight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Origin
 * TradeCertificateTypeCode.Origin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Health
 * TradeCertificateTypeCode.Health}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Phytosanitary
 * TradeCertificateTypeCode.Phytosanitary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Beneficiary
 * TradeCertificateTypeCode.Beneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#ShippingLine
 * TradeCertificateTypeCode.ShippingLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Undefined1
 * TradeCertificateTypeCode.Undefined1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#Undefined2
 * TradeCertificateTypeCode.Undefined2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeCertificateType1Code
 * TradeCertificateType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeCertificateType2Code
 * TradeCertificateType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ANLY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeCertificateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of trade certificate."</li>
 * </ul>
 */
public class TradeCertificateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate of analysis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANLY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Analysis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of analysis."</li>
	 * </ul>
	 */
	public static final MMCode Analysis = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Analysis";
			definition = "Certificate of analysis.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "ANLY";
		}
	};
	/**
	 * Certificate of quality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of quality."</li>
	 * </ul>
	 */
	public static final MMCode Quality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Certificate of quality.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "QUAL";
		}
	};
	/**
	 * Certificate of quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of quantity."</li>
	 * </ul>
	 */
	public static final MMCode Quantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Certificate of quantity.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "QUAN";
		}
	};
	/**
	 * Certificate of weight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of weight."</li>
	 * </ul>
	 */
	public static final MMCode Weight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Weight";
			definition = "Certificate of weight.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "WEIG";
		}
	};
	/**
	 * Certificate of origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of origin."</li>
	 * </ul>
	 */
	public static final MMCode Origin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Certificate of origin.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Certificate of health.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Health"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of health."</li>
	 * </ul>
	 */
	public static final MMCode Health = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Health";
			definition = "Certificate of health.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "HEAL";
		}
	};
	/**
	 * Phytosanitary certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phytosanitary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Phytosanitary certificate."</li>
	 * </ul>
	 */
	public static final MMCode Phytosanitary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Phytosanitary";
			definition = "Phytosanitary certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "PHYT";
		}
	};
	/**
	 * Beneficiary certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficiary certificate."</li>
	 * </ul>
	 */
	public static final MMCode Beneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Beneficiary";
			definition = "Beneficiary certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "BENE";
		}
	};
	/**
	 * Shipping line certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Shipping line certificate."</li>
	 * </ul>
	 */
	public static final MMCode ShippingLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShippingLine";
			definition = "Shipping line certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "SHIP";
		}
	};
	/**
	 * Undefined certificate at this stage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UND1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undefined1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undefined certificate at this stage."</li>
	 * </ul>
	 */
	public static final MMCode Undefined1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undefined1";
			definition = "Undefined certificate at this stage.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "UND1";
		}
	};
	/**
	 * Undefined certificate at this stage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UND2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undefined2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undefined certificate at this stage."</li>
	 * </ul>
	 */
	public static final MMCode Undefined2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undefined2";
			definition = "Undefined certificate at this stage.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "UND2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ANLY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeCertificateTypeCode";
				definition = "Specifies the type of trade certificate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeCertificateTypeCode.Analysis, com.tools20022.repository.codeset.TradeCertificateTypeCode.Quality,
						com.tools20022.repository.codeset.TradeCertificateTypeCode.Quantity, com.tools20022.repository.codeset.TradeCertificateTypeCode.Weight, com.tools20022.repository.codeset.TradeCertificateTypeCode.Origin,
						com.tools20022.repository.codeset.TradeCertificateTypeCode.Health, com.tools20022.repository.codeset.TradeCertificateTypeCode.Phytosanitary, com.tools20022.repository.codeset.TradeCertificateTypeCode.Beneficiary,
						com.tools20022.repository.codeset.TradeCertificateTypeCode.ShippingLine, com.tools20022.repository.codeset.TradeCertificateTypeCode.Undefined1, com.tools20022.repository.codeset.TradeCertificateTypeCode.Undefined2);
				derivation_lazy = () -> Arrays.asList(TradeCertificateType1Code.mmObject(), TradeCertificateType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}