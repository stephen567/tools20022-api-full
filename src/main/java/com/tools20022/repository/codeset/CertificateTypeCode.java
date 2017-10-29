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
 * Identifies the type of certificate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#DueFormationAndOrganisation
 * CertificateTypeCode.DueFormationAndOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#GoodStanding
 * CertificateTypeCode.GoodStanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#LetterOfReference
 * CertificateTypeCode.LetterOfReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#AntiMoneyLaundering
 * CertificateTypeCode.AntiMoneyLaundering}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#Incumbency
 * CertificateTypeCode.Incumbency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#Passport
 * CertificateTypeCode.Passport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#DrivingLicense
 * CertificateTypeCode.DrivingLicense}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#IdentityCard
 * CertificateTypeCode.IdentityCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#ProofOfAddress
 * CertificateTypeCode.ProofOfAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode#PublicKeyInfrastructureCertificate
 * CertificateTypeCode.PublicKeyInfrastructureCertificate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CertificateType1Code
 * CertificateType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CertificateType2Code
 * CertificateType2Code}</li>
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
 * <li>"DFOR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of certificate."</li>
 * </ul>
 */
public class CertificateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certification of due formation and organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueFormationAndOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification of due formation and organisation."</li>
	 * </ul>
	 */
	public static final MMCode DueFormationAndOrganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DueFormationAndOrganisation";
			definition = "Certification of due formation and organisation.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "DFOR";
		}
	};
	/**
	 * Certificate of good standing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodStanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of good standing."</li>
	 * </ul>
	 */
	public static final MMCode GoodStanding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoodStanding";
			definition = "Certificate of good standing.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "GOST";
		}
	};
	/**
	 * Letter of reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Letter of reference."</li>
	 * </ul>
	 */
	public static final MMCode LetterOfReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfReference";
			definition = "Letter of reference.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "LREF";
		}
	};
	/**
	 * Anti-money laundering certification form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AntiMoneyLaundering"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Anti-money laundering certification form."</li>
	 * </ul>
	 */
	public static final MMCode AntiMoneyLaundering = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AntiMoneyLaundering";
			definition = "Anti-money laundering certification form.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "AMLC";
		}
	};
	/**
	 * Certification of incumbency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incumbency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification of incumbency."</li>
	 * </ul>
	 */
	public static final MMCode Incumbency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incumbency";
			definition = "Certification of incumbency.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "INCU";
		}
	};
	/**
	 * Government issued form of picture identification - passport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Passport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Government issued form of picture identification - passport."</li>
	 * </ul>
	 */
	public static final MMCode Passport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Passport";
			definition = "Government issued form of picture identification - passport.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Government issued form of picture identification - driving license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DrivingLicense"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Government issued form of picture identification - driving license."</li>
	 * </ul>
	 */
	public static final MMCode DrivingLicense = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DrivingLicense";
			definition = "Government issued form of picture identification - driving license.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "DVLC";
		}
	};
	/**
	 * Government issued form of picture identification - identity card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Government issued form of picture identification - identity card."</li>
	 * </ul>
	 */
	public static final MMCode IdentityCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentityCard";
			definition = "Government issued form of picture identification - identity card.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "IDEN";
		}
	};
	/**
	 * Proof of the address, such as a utility bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProofOfAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proof of the address, such as a utility bill."</li>
	 * </ul>
	 */
	public static final MMCode ProofOfAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProofOfAddress";
			definition = "Proof of the address, such as a utility bill.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "PRAD";
		}
	};
	/**
	 * Public key infrastructure certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PKIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicKeyInfrastructureCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Public key infrastructure certificate."</li>
	 * </ul>
	 */
	public static final MMCode PublicKeyInfrastructureCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PublicKeyInfrastructureCertificate";
			definition = "Public key infrastructure certificate.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "PKIC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DFOR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CertificateTypeCode";
				definition = "Identifies the type of certificate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CertificateTypeCode.DueFormationAndOrganisation, com.tools20022.repository.codeset.CertificateTypeCode.GoodStanding,
						com.tools20022.repository.codeset.CertificateTypeCode.LetterOfReference, com.tools20022.repository.codeset.CertificateTypeCode.AntiMoneyLaundering, com.tools20022.repository.codeset.CertificateTypeCode.Incumbency,
						com.tools20022.repository.codeset.CertificateTypeCode.Passport, com.tools20022.repository.codeset.CertificateTypeCode.DrivingLicense, com.tools20022.repository.codeset.CertificateTypeCode.IdentityCard,
						com.tools20022.repository.codeset.CertificateTypeCode.ProofOfAddress, com.tools20022.repository.codeset.CertificateTypeCode.PublicKeyInfrastructureCertificate);
				derivation_lazy = () -> Arrays.asList(CertificateType1Code.mmObject(), CertificateType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}