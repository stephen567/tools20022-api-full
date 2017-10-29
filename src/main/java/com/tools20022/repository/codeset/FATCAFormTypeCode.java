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
 * Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateForeignStatusBeneficialOwner
 * FATCAFormTypeCode.CertificateForeignStatusBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateLossNationality
 * FATCAFormTypeCode.CertificateLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#SelfCertification
 * FATCAFormTypeCode.SelfCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#SelfCertificationLossNationality
 * FATCAFormTypeCode.SelfCertificationLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateForeignIntermediary
 * FATCAFormTypeCode.CertificateForeignIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#TaxpayerIdentificationNumberRequest
 * FATCAFormTypeCode.TaxpayerIdentificationNumberRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateForeignPersonsClaim
 * FATCAFormTypeCode.CertificateForeignPersonsClaim}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
 * FATCAFormType1Code}</li>
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
 * "FATCAFormTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form."</li>
 * </ul>
 */
public class FATCAFormTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate of foreign status of beneficial owner (also known as IRS form
	 * W-8BEN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignStatusBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of foreign status of beneficial owner (also known as IRS form W-8BEN)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CertificateForeignStatusBeneficialOwner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignStatusBeneficialOwner";
			definition = "Certificate of foreign status of beneficial owner (also known as IRS form W-8BEN).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER1";
		}
	};
	/**
	 * Certificate of loss of nationality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateLossNationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of loss of nationality."</li>
	 * </ul>
	 */
	public static final MMCode CertificateLossNationality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateLossNationality";
			definition = "Certificate of loss of nationality.";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER2";
		}
	};
	/**
	 * Self certification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Self certification."</li>
	 * </ul>
	 */
	public static final MMCode SelfCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertification";
			definition = "Self certification.";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER3";
		}
	};
	/**
	 * Self certificate of loss of nationality (also known as IRS form I-407).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationLossNationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Self certificate of loss of nationality (also known as IRS form I-407)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SelfCertificationLossNationality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationLossNationality";
			definition = "Self certificate of loss of nationality (also known as IRS form I-407).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER4";
		}
	};
	/**
	 * Certificate of foreign intermediary (also known as IRS form W-8IMY).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of foreign intermediary (also known as IRS form W-8IMY)."</li>
	 * </ul>
	 */
	public static final MMCode CertificateForeignIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignIntermediary";
			definition = "Certificate of foreign intermediary (also known as IRS form W-8IMY).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER5";
		}
	};
	/**
	 * Form is a request for taxpayer identification number and certification
	 * (also known as IRS form W9).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxpayerIdentificationNumberRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form is a request for taxpayer identification number and certification (also known as IRS form W9)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TaxpayerIdentificationNumberRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxpayerIdentificationNumberRequest";
			definition = "Form is a request for taxpayer identification number and certification (also known as IRS form W9).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER6";
		}
	};
	/**
	 * Certificate of foreign person's claim that income is effectively
	 * connected with the conduct of a trade or business in the United States
	 * (also known as IRS form W-8BEN-E).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignPersonsClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of foreign person's claim that income is effectively connected with the conduct of a trade or business in the United States (also known as IRS form W-8BEN-E)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CertificateForeignPersonsClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignPersonsClaim";
			definition = "Certificate of foreign person's claim that income is effectively connected with the conduct of a trade or business in the United States (also known as IRS form W-8BEN-E).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER7";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCAFormTypeCode";
				definition = "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignStatusBeneficialOwner, com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateLossNationality,
						com.tools20022.repository.codeset.FATCAFormTypeCode.SelfCertification, com.tools20022.repository.codeset.FATCAFormTypeCode.SelfCertificationLossNationality,
						com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignIntermediary, com.tools20022.repository.codeset.FATCAFormTypeCode.TaxpayerIdentificationNumberRequest,
						com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignPersonsClaim);
				derivation_lazy = () -> Arrays.asList(FATCAFormType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}