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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AuthenticationMethod4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Methods used to authenticate a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#OnLinePIN
 * AuthenticationMethod4Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#PaperSignature
 * AuthenticationMethod4Code.PaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#Password
 * AuthenticationMethod4Code.Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecureCertificate
 * AuthenticationMethod4Code.SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecuredChannel
 * AuthenticationMethod4Code.SecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecureNoCertificate
 * AuthenticationMethod4Code.SecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SignatureCapture
 * AuthenticationMethod4Code.SignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#BillingAddressVerification
 * AuthenticationMethod4Code.BillingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#Biometry
 * AuthenticationMethod4Code.Biometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#CardholderIdentificationData
 * AuthenticationMethod4Code.CardholderIdentificationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#CryptogramVerification
 * AuthenticationMethod4Code.CryptogramVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#CSCVerification
 * AuthenticationMethod4Code.CSCVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#PassiveAuthentication
 * AuthenticationMethod4Code.PassiveAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#SecureElectronicCommerce
 * AuthenticationMethod4Code.SecureElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#ShippingAddressVerification
 * AuthenticationMethod4Code.ShippingAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#TokenAuthentication
 * AuthenticationMethod4Code.TokenAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#ManualVerification
 * AuthenticationMethod4Code.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code#OfflinePIN
 * AuthenticationMethod4Code.OfflinePIN}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethod4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person."</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
 * AuthenticationMethod6Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
 * AuthenticationMethod3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationMethod4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#OnLinePIN
	 * AuthenticationMethod6Code.OnLinePIN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#OnLinePIN
	 * AuthenticationMethod3Code.OnLinePIN}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code OnLinePIN = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.OnLinePIN);
			previousVersion_lazy = () -> AuthenticationMethod3Code.OnLinePIN;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#PaperSignature
	 * AuthenticationMethod6Code.PaperSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#PaperSignature
	 * AuthenticationMethod3Code.PaperSignature}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code PaperSignature = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.PaperSignature);
			previousVersion_lazy = () -> AuthenticationMethod3Code.PaperSignature;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.PaperSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#Password
	 * AuthenticationMethod6Code.Password}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#Password
	 * AuthenticationMethod3Code.Password}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code Password = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.Password);
			previousVersion_lazy = () -> AuthenticationMethod3Code.Password;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.Password.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecureCertificate
	 * AuthenticationMethod6Code.SecureCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureCertificate
	 * AuthenticationMethod3Code.SecureCertificate}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code SecureCertificate = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.SecureCertificate);
			previousVersion_lazy = () -> AuthenticationMethod3Code.SecureCertificate;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.SecureCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecuredChannel
	 * AuthenticationMethod6Code.SecuredChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecuredChannel
	 * AuthenticationMethod3Code.SecuredChannel}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code SecuredChannel = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.SecuredChannel);
			previousVersion_lazy = () -> AuthenticationMethod3Code.SecuredChannel;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.SecuredChannel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecureNoCertificate
	 * AuthenticationMethod6Code.SecureNoCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureNoCertificate
	 * AuthenticationMethod3Code.SecureNoCertificate}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code SecureNoCertificate = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.SecureNoCertificate);
			previousVersion_lazy = () -> AuthenticationMethod3Code.SecureNoCertificate;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.SecureNoCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SignatureCapture
	 * AuthenticationMethod6Code.SignatureCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SignatureCapture
	 * AuthenticationMethod3Code.SignatureCapture}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code SignatureCapture = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.SignatureCapture);
			previousVersion_lazy = () -> AuthenticationMethod3Code.SignatureCapture;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.SignatureCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#BillingAddressVerification
	 * AuthenticationMethod6Code.BillingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#BillingAddressVerification
	 * AuthenticationMethod3Code.BillingAddressVerification}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code BillingAddressVerification = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.BillingAddressVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.BillingAddressVerification;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.BillingAddressVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#Biometry
	 * AuthenticationMethod6Code.Biometry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#Biometry
	 * AuthenticationMethod3Code.Biometry}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code Biometry = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.Biometry);
			previousVersion_lazy = () -> AuthenticationMethod3Code.Biometry;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.Biometry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentificationData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#CardholderIdentificationData
	 * AuthenticationMethod6Code.CardholderIdentificationData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#CardholderIdentificationData
	 * AuthenticationMethod3Code.CardholderIdentificationData}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code CardholderIdentificationData = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.CardholderIdentificationData);
			previousVersion_lazy = () -> AuthenticationMethod3Code.CardholderIdentificationData;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.CardholderIdentificationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CryptogramVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#CryptogramVerification
	 * AuthenticationMethod6Code.CryptogramVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#CryptogramVerification
	 * AuthenticationMethod3Code.CryptogramVerification}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code CryptogramVerification = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.CryptogramVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.CryptogramVerification;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.CryptogramVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#CSCVerification
	 * AuthenticationMethod6Code.CSCVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#CSCVerification
	 * AuthenticationMethod3Code.CSCVerification}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code CSCVerification = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.CSCVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.CSCVerification;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.CSCVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassiveAuthentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#PassiveAuthentication
	 * AuthenticationMethod6Code.PassiveAuthentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#PassiveAuthentication
	 * AuthenticationMethod3Code.PassiveAuthentication}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code PassiveAuthentication = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.PassiveAuthentication);
			previousVersion_lazy = () -> AuthenticationMethod3Code.PassiveAuthentication;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.PassiveAuthentication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#SecureElectronicCommerce
	 * AuthenticationMethod6Code.SecureElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureElectronicCommerce
	 * AuthenticationMethod3Code.SecureElectronicCommerce}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code SecureElectronicCommerce = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.SecureElectronicCommerce);
			previousVersion_lazy = () -> AuthenticationMethod3Code.SecureElectronicCommerce;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.SecureElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#ShippingAddressVerification
	 * AuthenticationMethod6Code.ShippingAddressVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#ShippingAddressVerification
	 * AuthenticationMethod3Code.ShippingAddressVerification}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code ShippingAddressVerification = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.ShippingAddressVerification);
			previousVersion_lazy = () -> AuthenticationMethod3Code.ShippingAddressVerification;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.ShippingAddressVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAuthentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#TokenAuthentication
	 * AuthenticationMethod3Code.TokenAuthentication}</li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code TokenAuthentication = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAuthentication";
			previousVersion_lazy = () -> AuthenticationMethod3Code.TokenAuthentication;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.TokenAuthentication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#ManualVerification
	 * AuthenticationMethod6Code.ManualVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code ManualVerification = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.ManualVerification);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.ManualVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code#OfflinePIN
	 * AuthenticationMethod6Code.OfflinePIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod4Code OfflinePIN = new AuthenticationMethod4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.OfflinePIN);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod4Code.mmObject();
			codeName = AuthenticationMethodCode.OfflinePIN.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationMethod4Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationMethod4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod4Code";
				definition = "Methods used to authenticate a person.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod6Code.mmObject());
				previousVersion_lazy = () -> AuthenticationMethod3Code.mmObject();
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod4Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod4Code.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.Password, com.tools20022.repository.codeset.AuthenticationMethod4Code.SecureCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethod4Code.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod4Code.BillingAddressVerification,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.Biometry, com.tools20022.repository.codeset.AuthenticationMethod4Code.CardholderIdentificationData,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.CryptogramVerification, com.tools20022.repository.codeset.AuthenticationMethod4Code.CSCVerification,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.PassiveAuthentication, com.tools20022.repository.codeset.AuthenticationMethod4Code.SecureElectronicCommerce,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.ShippingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethod4Code.TokenAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethod4Code.ManualVerification, com.tools20022.repository.codeset.AuthenticationMethod4Code.OfflinePIN);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnLinePIN.getCodeName().get(), OnLinePIN);
		codesByName.put(PaperSignature.getCodeName().get(), PaperSignature);
		codesByName.put(Password.getCodeName().get(), Password);
		codesByName.put(SecureCertificate.getCodeName().get(), SecureCertificate);
		codesByName.put(SecuredChannel.getCodeName().get(), SecuredChannel);
		codesByName.put(SecureNoCertificate.getCodeName().get(), SecureNoCertificate);
		codesByName.put(SignatureCapture.getCodeName().get(), SignatureCapture);
		codesByName.put(BillingAddressVerification.getCodeName().get(), BillingAddressVerification);
		codesByName.put(Biometry.getCodeName().get(), Biometry);
		codesByName.put(CardholderIdentificationData.getCodeName().get(), CardholderIdentificationData);
		codesByName.put(CryptogramVerification.getCodeName().get(), CryptogramVerification);
		codesByName.put(CSCVerification.getCodeName().get(), CSCVerification);
		codesByName.put(PassiveAuthentication.getCodeName().get(), PassiveAuthentication);
		codesByName.put(SecureElectronicCommerce.getCodeName().get(), SecureElectronicCommerce);
		codesByName.put(ShippingAddressVerification.getCodeName().get(), ShippingAddressVerification);
		codesByName.put(TokenAuthentication.getCodeName().get(), TokenAuthentication);
		codesByName.put(ManualVerification.getCodeName().get(), ManualVerification);
		codesByName.put(OfflinePIN.getCodeName().get(), OfflinePIN);
	}

	public static AuthenticationMethod4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationMethod4Code[] values() {
		AuthenticationMethod4Code[] values = new AuthenticationMethod4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationMethod4Code> {
		@Override
		public AuthenticationMethod4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationMethod4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}