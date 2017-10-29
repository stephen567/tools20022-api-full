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
import com.tools20022.repository.codeset.AuthenticationMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Methods used to authenticate a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#OnLinePIN
 * AuthenticationMethod3Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#PaperSignature
 * AuthenticationMethod3Code.PaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#Password
 * AuthenticationMethod3Code.Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureCertificate
 * AuthenticationMethod3Code.SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecuredChannel
 * AuthenticationMethod3Code.SecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureNoCertificate
 * AuthenticationMethod3Code.SecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SignatureCapture
 * AuthenticationMethod3Code.SignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#BillingAddressVerification
 * AuthenticationMethod3Code.BillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#Biometry
 * AuthenticationMethod3Code.Biometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#CardholderIdentificationData
 * AuthenticationMethod3Code.CardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#CryptogramVerification
 * AuthenticationMethod3Code.CryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#CSCVerification
 * AuthenticationMethod3Code.CSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#PassiveAuthentication
 * AuthenticationMethod3Code.PassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureElectronicCommerce
 * AuthenticationMethod3Code.SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#ShippingAddressVerification
 * AuthenticationMethod3Code.ShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#TokenAuthentication
 * AuthenticationMethod3Code.TokenAuthentication}</li>
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
 * <li>"ADDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethod3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
 * AuthenticationMethod4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
 * AuthenticationMethod5Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
 * AuthenticationMethod2Code}</li>
 * </ul>
 */
public class AuthenticationMethod3Code extends AuthenticationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#OnLinePIN
	 * AuthenticationMethod4Code.OnLinePIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#OnLinePIN
	 * AuthenticationMethod5Code.OnLinePIN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#OnLinePIN
	 * AuthenticationMethod2Code.OnLinePIN}</li>
	 * </ul>
	 */
	public static final MMCode OnLinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.OnLinePIN;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod5Code.OnLinePIN);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#PaperSignature
	 * AuthenticationMethod4Code.PaperSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#PaperSignature
	 * AuthenticationMethod5Code.PaperSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#PaperSignature
	 * AuthenticationMethod2Code.PaperSignature}</li>
	 * </ul>
	 */
	public static final MMCode PaperSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.PaperSignature;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.PaperSignature, com.tools20022.repository.codeset.AuthenticationMethod5Code.PaperSignature);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#Password
	 * AuthenticationMethod4Code.Password}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#Password
	 * AuthenticationMethod5Code.Password}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#Password
	 * AuthenticationMethod2Code.Password}</li>
	 * </ul>
	 */
	public static final MMCode Password = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.Password;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.Password, com.tools20022.repository.codeset.AuthenticationMethod5Code.Password);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecureCertificate
	 * AuthenticationMethod4Code.SecureCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecureCertificate
	 * AuthenticationMethod5Code.SecureCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SecureCertificate
	 * AuthenticationMethod2Code.SecureCertificate}</li>
	 * </ul>
	 */
	public static final MMCode SecureCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.SecureCertificate;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.SecureCertificate, com.tools20022.repository.codeset.AuthenticationMethod5Code.SecureCertificate);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecuredChannel
	 * AuthenticationMethod4Code.SecuredChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecuredChannel
	 * AuthenticationMethod5Code.SecuredChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SecuredChannel
	 * AuthenticationMethod2Code.SecuredChannel}</li>
	 * </ul>
	 */
	public static final MMCode SecuredChannel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.SecuredChannel;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethod5Code.SecuredChannel);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecureNoCertificate
	 * AuthenticationMethod4Code.SecureNoCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecureNoCertificate
	 * AuthenticationMethod5Code.SecureNoCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SecureNoCertificate
	 * AuthenticationMethod2Code.SecureNoCertificate}</li>
	 * </ul>
	 */
	public static final MMCode SecureNoCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.SecureNoCertificate;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.SecureNoCertificate, com.tools20022.repository.codeset.AuthenticationMethod5Code.SecureNoCertificate);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SignatureCapture
	 * AuthenticationMethod4Code.SignatureCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SignatureCapture
	 * AuthenticationMethod5Code.SignatureCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SignatureCapture
	 * AuthenticationMethod2Code.SignatureCapture}</li>
	 * </ul>
	 */
	public static final MMCode SignatureCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.SignatureCapture;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod5Code.SignatureCapture);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#BillingAddressVerification
	 * AuthenticationMethod4Code.BillingAddressVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#BillingAddressVerification
	 * AuthenticationMethod5Code.BillingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode BillingAddressVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.BillingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethod5Code.BillingAddressVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#Biometry
	 * AuthenticationMethod4Code.Biometry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#Biometry
	 * AuthenticationMethod5Code.Biometry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Biometry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.Biometry, com.tools20022.repository.codeset.AuthenticationMethod5Code.Biometry);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#CardholderIdentificationData
	 * AuthenticationMethod4Code.CardholderIdentificationData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#CardholderIdentificationData
	 * AuthenticationMethod5Code.CardholderIdentificationData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CardholderIdentificationData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.CardholderIdentificationData, com.tools20022.repository.codeset.AuthenticationMethod5Code.CardholderIdentificationData);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#CryptogramVerification
	 * AuthenticationMethod4Code.CryptogramVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#CryptogramVerification
	 * AuthenticationMethod5Code.CryptogramVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CryptogramVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.CryptogramVerification, com.tools20022.repository.codeset.AuthenticationMethod5Code.CryptogramVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#CSCVerification
	 * AuthenticationMethod4Code.CSCVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#CSCVerification
	 * AuthenticationMethod5Code.CSCVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CSCVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.CSCVerification, com.tools20022.repository.codeset.AuthenticationMethod5Code.CSCVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#PassiveAuthentication
	 * AuthenticationMethod4Code.PassiveAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#PassiveAuthentication
	 * AuthenticationMethod5Code.PassiveAuthentication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode PassiveAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.PassiveAuthentication, com.tools20022.repository.codeset.AuthenticationMethod5Code.PassiveAuthentication);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecureElectronicCommerce
	 * AuthenticationMethod4Code.SecureElectronicCommerce}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#SecureElectronicCommerce
	 * AuthenticationMethod5Code.SecureElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.SecureElectronicCommerce, com.tools20022.repository.codeset.AuthenticationMethod5Code.SecureElectronicCommerce);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#ShippingAddressVerification
	 * AuthenticationMethod4Code.ShippingAddressVerification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code#ShippingAddressVerification
	 * AuthenticationMethod5Code.ShippingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode ShippingAddressVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.ShippingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethod5Code.ShippingAddressVerification);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
	 * AuthenticationMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAuthentication"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#TokenAuthentication
	 * AuthenticationMethod4Code.TokenAuthentication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode TokenAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAuthentication";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.TokenAuthentication);
			owner_lazy = () -> AuthenticationMethod3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ADDB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod3Code";
				definition = "Methods used to authenticate a person.";
				previousVersion_lazy = () -> AuthenticationMethod2Code.mmObject();
				nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod4Code.mmObject(), AuthenticationMethod5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod3Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod3Code.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethod3Code.Password, com.tools20022.repository.codeset.AuthenticationMethod3Code.SecureCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod3Code.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethod3Code.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod3Code.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod3Code.BillingAddressVerification,
						com.tools20022.repository.codeset.AuthenticationMethod3Code.Biometry, com.tools20022.repository.codeset.AuthenticationMethod3Code.CardholderIdentificationData,
						com.tools20022.repository.codeset.AuthenticationMethod3Code.CryptogramVerification, com.tools20022.repository.codeset.AuthenticationMethod3Code.CSCVerification,
						com.tools20022.repository.codeset.AuthenticationMethod3Code.PassiveAuthentication, com.tools20022.repository.codeset.AuthenticationMethod3Code.SecureElectronicCommerce,
						com.tools20022.repository.codeset.AuthenticationMethod3Code.ShippingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethod3Code.TokenAuthentication);
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}