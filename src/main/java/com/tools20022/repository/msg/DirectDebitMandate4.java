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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentificationAndName3;
import com.tools20022.repository.msg.BranchData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instruction, initiated by the creditor, to debit a debtor's account in favour
 * of the creditor. A direct debit can be pre-authorised or not. In most
 * countries, authorisation is in the form of a mandate between the debtor and
 * creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAccount
 * DirectDebitMandate4.mmDebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtor
 * DirectDebitMandate4.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorTaxIdentificationNumber
 * DirectDebitMandate4.mmDebtorTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorNationalRegistrationNumber
 * DirectDebitMandate4.mmDebtorNationalRegistrationNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmCreditor
 * DirectDebitMandate4.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAgent
 * DirectDebitMandate4.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAgentBranch
 * DirectDebitMandate4.mmDebtorAgentBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmCreditorAgent
 * DirectDebitMandate4.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmCreditorAgentBranch
 * DirectDebitMandate4.mmCreditorAgentBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmRegistrationIdentification
 * DirectDebitMandate4.mmRegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmMandateIdentification
 * DirectDebitMandate4.mmMandateIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebit
 * DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DirectDebitMandate4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate5
 * DirectDebitMandate5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate6
 * DirectDebitMandate6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectDebitMandate4", propOrder = {"debtorAccount", "debtor", "debtorTaxIdentificationNumber", "debtorNationalRegistrationNumber", "creditor", "debtorAgent", "debtorAgentBranch", "creditorAgent", "creditorAgentBranch",
		"registrationIdentification", "mandateIdentification"})
public class DirectDebitMandate4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtrAcct", required = true)
	protected AccountIdentificationAndName3 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName3
	 * AccountIdentificationAndName3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAccount
	 * DirectDebitMandate5.mmDebtorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorAccount
	 * DirectDebitMandate6.mmDebtorAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, AccountIdentificationAndName3> mmDebtorAccount = new MMMessageAttribute<DirectDebitMandate4, AccountIdentificationAndName3>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmDebtorAccount, DirectDebitMandate6.mmDebtorAccount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationAndName3.mmObject();
		}

		@Override
		public AccountIdentificationAndName3 getValue(DirectDebitMandate4 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, AccountIdentificationAndName3 value) {
			obj.setDebtorAccount(value);
		}
	};
	@XmlElement(name = "Dbtr")
	protected PartyIdentification2Choice debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes the cash to the creditor/final party. The debtor is also the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtor
	 * DirectDebitMandate5.mmDebtor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtor
	 * DirectDebitMandate6.mmDebtor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<PartyIdentification2Choice>> mmDebtor = new MMMessageAttribute<DirectDebitMandate4, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes the cash to the creditor/final party. The debtor is also the debit account owner.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmDebtor, DirectDebitMandate6.mmDebtor);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(DirectDebitMandate4 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<PartyIdentification2Choice> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrTaxIdNb")
	protected Max35Text debtorTaxIdentificationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrTaxIdNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorTaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate5.mmDebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate6.mmDebtorTaxIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>> mmDebtorTaxIdentificationNumber = new MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "DbtrTaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorTaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmDebtorTaxIdentificationNumber, DirectDebitMandate6.mmDebtorTaxIdentificationNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate4 obj) {
			return obj.getDebtorTaxIdentificationNumber();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<Max35Text> value) {
			obj.setDebtorTaxIdentificationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrNtlRegnNb")
	protected Max35Text debtorNationalRegistrationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
	 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrNtlRegnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorNationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate5.mmDebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate6.mmDebtorNationalRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>> mmDebtorNationalRegistrationNumber = new MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmNationalRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "DbtrNtlRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorNationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmDebtorNationalRegistrationNumber, DirectDebitMandate6.mmDebtorNationalRegistrationNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate4 obj) {
			return obj.getDebtorNationalRegistrationNumber();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<Max35Text> value) {
			obj.setDebtorNationalRegistrationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentification2Choice creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmCreditor
	 * DirectDebitMandate5.mmCreditor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmCreditor
	 * DirectDebitMandate6.mmCreditor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<PartyIdentification2Choice>> mmCreditor = new MMMessageAttribute<DirectDebitMandate4, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmCreditor, DirectDebitMandate6.mmCreditor);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(DirectDebitMandate4 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<PartyIdentification2Choice> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt", required = true)
	protected FinancialInstitutionIdentification3Choice debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice
	 * FinancialInstitutionIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the direct debit instruction from the creditor or other authorised party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAgent
	 * DirectDebitMandate5.mmDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorAgent
	 * DirectDebitMandate6.mmDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, FinancialInstitutionIdentification3Choice> mmDebtorAgent = new MMMessageAttribute<DirectDebitMandate4, FinancialInstitutionIdentification3Choice>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution that receives the direct debit instruction from the creditor or other authorised party.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmDebtorAgent, DirectDebitMandate6.mmDebtorAgent);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstitutionIdentification3Choice.mmObject();
		}

		@Override
		public FinancialInstitutionIdentification3Choice getValue(DirectDebitMandate4 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, FinancialInstitutionIdentification3Choice value) {
			obj.setDebtorAgent(value);
		}
	};
	@XmlElement(name = "DbtrAgtBrnch")
	protected BranchData debtorAgentBranch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BranchData
	 * BranchData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmBranch
	 * Organisation.mmBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtBrnch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAgentBranch
	 * DirectDebitMandate5.mmDebtorAgentBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorAgentBranch
	 * DirectDebitMandate6.mmDebtorAgentBranch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<BranchData>> mmDebtorAgentBranch = new MMMessageAttribute<DirectDebitMandate4, Optional<BranchData>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmBranch;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmDebtorAgentBranch, DirectDebitMandate6.mmDebtorAgentBranch);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchData.mmObject();
		}

		@Override
		public Optional<BranchData> getValue(DirectDebitMandate4 obj) {
			return obj.getDebtorAgentBranch();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<BranchData> value) {
			obj.setDebtorAgentBranch(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected FinancialInstitutionIdentification3Choice creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice
	 * FinancialInstitutionIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction on behalf of the creditor, or other nominated party, and credits the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmCreditorAgent
	 * DirectDebitMandate5.mmCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmCreditorAgent
	 * DirectDebitMandate6.mmCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<FinancialInstitutionIdentification3Choice>> mmCreditorAgent = new MMMessageAttribute<DirectDebitMandate4, Optional<FinancialInstitutionIdentification3Choice>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution that receives the payment transaction on behalf of the creditor, or other nominated party, and credits the account.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmCreditorAgent, DirectDebitMandate6.mmCreditorAgent);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification3Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification3Choice> getValue(DirectDebitMandate4 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<FinancialInstitutionIdentification3Choice> value) {
			obj.setCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgtBrnch")
	protected BranchData creditorAgentBranch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BranchData
	 * BranchData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtBrnch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmCreditorAgentBranch
	 * DirectDebitMandate5.mmCreditorAgentBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmCreditorAgentBranch
	 * DirectDebitMandate6.mmCreditorAgentBranch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<BranchData>> mmCreditorAgentBranch = new MMMessageAttribute<DirectDebitMandate4, Optional<BranchData>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmCreditorAgentBranch, DirectDebitMandate6.mmCreditorAgentBranch);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchData.mmObject();
		}

		@Override
		public Optional<BranchData> getValue(DirectDebitMandate4 obj) {
			return obj.getCreditorAgentBranch();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<BranchData> value) {
			obj.setCreditorAgentBranch(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnId")
	protected Max35Text registrationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmRegistrationIdentification
	 * DirectDebit.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmRegistrationIdentification
	 * DirectDebitMandate5.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmRegistrationIdentification
	 * DirectDebitMandate6.mmRegistrationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>> mmRegistrationIdentification = new MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> DirectDebit.mmRegistrationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "RegnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmRegistrationIdentification, DirectDebitMandate6.mmRegistrationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate4 obj) {
			return obj.getRegistrationIdentification();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<Max35Text> value) {
			obj.setRegistrationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MndtId")
	protected Max35Text mandateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
	 * DirectDebitMandate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the direct debit mandate that has been agreed upon by the debtor and creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmMandateIdentification
	 * DirectDebitMandate5.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmMandateIdentification
	 * DirectDebitMandate6.mmMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>> mmMandateIdentification = new MMMessageAttribute<DirectDebitMandate4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate4.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Reference of the direct debit mandate that has been agreed upon by the debtor and creditor.";
			nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmMandateIdentification, DirectDebitMandate6.mmMandateIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate4 obj) {
			return obj.getMandateIdentification();
		}

		@Override
		public void setValue(DirectDebitMandate4 obj, Optional<Max35Text> value) {
			obj.setMandateIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitMandate4.mmDebtorAccount, com.tools20022.repository.msg.DirectDebitMandate4.mmDebtor,
						com.tools20022.repository.msg.DirectDebitMandate4.mmDebtorTaxIdentificationNumber, com.tools20022.repository.msg.DirectDebitMandate4.mmDebtorNationalRegistrationNumber,
						com.tools20022.repository.msg.DirectDebitMandate4.mmCreditor, com.tools20022.repository.msg.DirectDebitMandate4.mmDebtorAgent, com.tools20022.repository.msg.DirectDebitMandate4.mmDebtorAgentBranch,
						com.tools20022.repository.msg.DirectDebitMandate4.mmCreditorAgent, com.tools20022.repository.msg.DirectDebitMandate4.mmCreditorAgentBranch,
						com.tools20022.repository.msg.DirectDebitMandate4.mmRegistrationIdentification, com.tools20022.repository.msg.DirectDebitMandate4.mmMandateIdentification);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate4";
				definition = "Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
				nextVersions_lazy = () -> Arrays.asList(DirectDebitMandate5.mmObject(), DirectDebitMandate6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentificationAndName3 getDebtorAccount() {
		return debtorAccount;
	}

	public DirectDebitMandate4 setDebtorAccount(AccountIdentificationAndName3 debtorAccount) {
		this.debtorAccount = Objects.requireNonNull(debtorAccount);
		return this;
	}

	public Optional<PartyIdentification2Choice> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public DirectDebitMandate4 setDebtor(PartyIdentification2Choice debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<Max35Text> getDebtorTaxIdentificationNumber() {
		return debtorTaxIdentificationNumber == null ? Optional.empty() : Optional.of(debtorTaxIdentificationNumber);
	}

	public DirectDebitMandate4 setDebtorTaxIdentificationNumber(Max35Text debtorTaxIdentificationNumber) {
		this.debtorTaxIdentificationNumber = debtorTaxIdentificationNumber;
		return this;
	}

	public Optional<Max35Text> getDebtorNationalRegistrationNumber() {
		return debtorNationalRegistrationNumber == null ? Optional.empty() : Optional.of(debtorNationalRegistrationNumber);
	}

	public DirectDebitMandate4 setDebtorNationalRegistrationNumber(Max35Text debtorNationalRegistrationNumber) {
		this.debtorNationalRegistrationNumber = debtorNationalRegistrationNumber;
		return this;
	}

	public Optional<PartyIdentification2Choice> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public DirectDebitMandate4 setCreditor(PartyIdentification2Choice creditor) {
		this.creditor = creditor;
		return this;
	}

	public FinancialInstitutionIdentification3Choice getDebtorAgent() {
		return debtorAgent;
	}

	public DirectDebitMandate4 setDebtorAgent(FinancialInstitutionIdentification3Choice debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<BranchData> getDebtorAgentBranch() {
		return debtorAgentBranch == null ? Optional.empty() : Optional.of(debtorAgentBranch);
	}

	public DirectDebitMandate4 setDebtorAgentBranch(BranchData debtorAgentBranch) {
		this.debtorAgentBranch = debtorAgentBranch;
		return this;
	}

	public Optional<FinancialInstitutionIdentification3Choice> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public DirectDebitMandate4 setCreditorAgent(FinancialInstitutionIdentification3Choice creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<BranchData> getCreditorAgentBranch() {
		return creditorAgentBranch == null ? Optional.empty() : Optional.of(creditorAgentBranch);
	}

	public DirectDebitMandate4 setCreditorAgentBranch(BranchData creditorAgentBranch) {
		this.creditorAgentBranch = creditorAgentBranch;
		return this;
	}

	public Optional<Max35Text> getRegistrationIdentification() {
		return registrationIdentification == null ? Optional.empty() : Optional.of(registrationIdentification);
	}

	public DirectDebitMandate4 setRegistrationIdentification(Max35Text registrationIdentification) {
		this.registrationIdentification = registrationIdentification;
		return this;
	}

	public Optional<Max35Text> getMandateIdentification() {
		return mandateIdentification == null ? Optional.empty() : Optional.of(mandateIdentification);
	}

	public DirectDebitMandate4 setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
		return this;
	}
}