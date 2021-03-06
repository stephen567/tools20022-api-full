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
import com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of money laundering identification procedures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code#Passed
 * OldMoneyLaunderingCheck1Code.Passed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code#NotChecked
 * OldMoneyLaunderingCheck1Code.NotChecked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code#ExemptBelowLimit
 * OldMoneyLaunderingCheck1Code.ExemptBelowLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code#ClientMoneyTypeExempt
 * OldMoneyLaunderingCheck1Code.ClientMoneyTypeExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code#AuthorisedCredit
 * OldMoneyLaunderingCheck1Code.AuthorisedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code#PostalOrElectronicPaymentExempt
 * OldMoneyLaunderingCheck1Code.PostalOrElectronicPaymentExempt}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OldMoneyLaunderingCheck1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of money laundering identification procedures."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PASS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OldMoneyLaunderingCheck1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Money laundering identification procedures have been carried out by the
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Passed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have been carried out by the intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final OldMoneyLaunderingCheck1Code Passed = new OldMoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Passed";
			definition = "Money laundering identification procedures have been carried out by the intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotChecked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final OldMoneyLaunderingCheck1Code NotChecked = new OldMoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotChecked";
			definition = "Money laundering identification procedures have not been carried out.";
			owner_lazy = () -> com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.mmObject();
			codeName = "NOTC";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because the transaction is below the prescribed limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptBelowLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out because the transaction is below the prescribed limit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final OldMoneyLaunderingCheck1Code ExemptBelowLimit = new OldMoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExemptBelowLimit";
			definition = "Money laundering identification procedures have not been carried out because the transaction is below the prescribed limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.mmObject();
			codeName = "EXEM";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because of the transaction type, eg, switch, or because the transaction
	 * is being funded from an existing investor account held by the
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLMO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientMoneyTypeExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out because of the transaction type, eg, switch, or because the transaction is being funded from an existing investor account held by the intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final OldMoneyLaunderingCheck1Code ClientMoneyTypeExempt = new OldMoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientMoneyTypeExempt";
			definition = "Money laundering identification procedures have not been carried out because of the transaction type, eg, switch, or because the transaction is being funded from an existing investor account held by the intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.mmObject();
			codeName = "CLMO";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because the investor is an authorised credit or financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out because the investor is an authorised credit or financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final OldMoneyLaunderingCheck1Code AuthorisedCredit = new OldMoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedCredit";
			definition = "Money laundering identification procedures have not been carried out because the investor is an authorised credit or financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Limited money laundering identification procedures have been carried out
	 * because it is a one time only transaction and the payment is being made
	 * by postal, telephone or electronic transfers from an existing account
	 * with an authorised credit or financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POEP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalOrElectronicPaymentExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limited money laundering identification procedures have been carried out because it is a one time only transaction and the payment is being made by postal, telephone or electronic transfers from an existing account with an authorised credit or financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final OldMoneyLaunderingCheck1Code PostalOrElectronicPaymentExempt = new OldMoneyLaunderingCheck1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostalOrElectronicPaymentExempt";
			definition = "Limited money laundering identification procedures have been carried out because it is a one time only transaction and the payment is being made by postal, telephone or electronic transfers from an existing account with an authorised credit or financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.mmObject();
			codeName = "POEP";
		}
	};
	final static private LinkedHashMap<String, OldMoneyLaunderingCheck1Code> codesByName = new LinkedHashMap<>();

	protected OldMoneyLaunderingCheck1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PASS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OldMoneyLaunderingCheck1Code";
				definition = "Specifies the status of money laundering identification procedures.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.Passed, com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.NotChecked,
						com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.ExemptBelowLimit, com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.ClientMoneyTypeExempt,
						com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.AuthorisedCredit, com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code.PostalOrElectronicPaymentExempt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Passed.getCodeName().get(), Passed);
		codesByName.put(NotChecked.getCodeName().get(), NotChecked);
		codesByName.put(ExemptBelowLimit.getCodeName().get(), ExemptBelowLimit);
		codesByName.put(ClientMoneyTypeExempt.getCodeName().get(), ClientMoneyTypeExempt);
		codesByName.put(AuthorisedCredit.getCodeName().get(), AuthorisedCredit);
		codesByName.put(PostalOrElectronicPaymentExempt.getCodeName().get(), PostalOrElectronicPaymentExempt);
	}

	public static OldMoneyLaunderingCheck1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OldMoneyLaunderingCheck1Code[] values() {
		OldMoneyLaunderingCheck1Code[] values = new OldMoneyLaunderingCheck1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OldMoneyLaunderingCheck1Code> {
		@Override
		public OldMoneyLaunderingCheck1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OldMoneyLaunderingCheck1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}