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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.PartyIdentification43;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the list of direct debit mandate elements that
 * have been modified when the amendment indicator has been set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalMandateIdentification
 * AmendmentInformationDetails8.mmOriginalMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorSchemeIdentification
 * AmendmentInformationDetails8.mmOriginalCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorAgent
 * AmendmentInformationDetails8.mmOriginalCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorAgentAccount
 * AmendmentInformationDetails8.mmOriginalCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtor
 * AmendmentInformationDetails8.mmOriginalDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAccount
 * AmendmentInformationDetails8.mmOriginalDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAgent
 * AmendmentInformationDetails8.mmOriginalDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAgentAccount
 * AmendmentInformationDetails8.mmOriginalDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFinalCollectionDate
 * AmendmentInformationDetails8.mmOriginalFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFrequency
 * AmendmentInformationDetails8.mmOriginalFrequency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmendmentInformationDetails8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
 * AmendmentInformationDetails10}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmendmentInformationDetails8", propOrder = {"originalMandateIdentification", "originalCreditorSchemeIdentification", "originalCreditorAgent", "originalCreditorAgentAccount", "originalDebtor", "originalDebtorAccount",
		"originalDebtorAgent", "originalDebtorAgentAccount", "originalFinalCollectionDate", "originalFrequency"})
public class AmendmentInformationDetails8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMndtId")
	protected Max35Text originalMandateIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalMandateIdentification
	 * AmendmentInformationDetails10.mmOriginalMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails8, Optional<Max35Text>> mmOriginalMandateIdentification = new MMMessageAttribute<AmendmentInformationDetails8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalMandateIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalMandateIdentification();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<Max35Text> value) {
			obj.setOriginalMandateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrSchmeId")
	protected PartyIdentification43 originalCreditorSchemeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrSchmeId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original creditor scheme identification that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails10.mmOriginalCreditorSchemeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<PartyIdentification43>> mmOriginalCreditorSchemeIdentification = new MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorSchemeIdentification";
			definition = "Original creditor scheme identification that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalCreditorSchemeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalCreditorSchemeIdentification();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<PartyIdentification43> value) {
			obj.setOriginalCreditorSchemeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrAgt")
	protected BranchAndFinancialInstitutionIdentification5 originalCreditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorAgent
	 * AmendmentInformationDetails10.mmOriginalCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<BranchAndFinancialInstitutionIdentification5>> mmOriginalCreditorAgent = new MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgent";
			definition = "Original creditor agent that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalCreditorAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalCreditorAgent();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setOriginalCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrAgtAcct")
	protected CashAccount24 originalCreditorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent account that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorAgentAccount
	 * AmendmentInformationDetails10.mmOriginalCreditorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<CashAccount24>> mmOriginalCreditorAgentAccount = new MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgentAccount";
			definition = "Original creditor agent account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalCreditorAgentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalCreditorAgentAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<CashAccount24> value) {
			obj.setOriginalCreditorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtr")
	protected PartyIdentification43 originalDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtor
	 * AmendmentInformationDetails10.mmOriginalDebtor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<PartyIdentification43>> mmOriginalDebtor = new MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtor";
			definition = "Original debtor that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalDebtor();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<PartyIdentification43> value) {
			obj.setOriginalDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAcct")
	protected CashAccount24 originalDebtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor account that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAccount
	 * AmendmentInformationDetails10.mmOriginalDebtorAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<CashAccount24>> mmOriginalDebtorAccount = new MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAccount";
			definition = "Original debtor account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtorAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalDebtorAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<CashAccount24> value) {
			obj.setOriginalDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAgt")
	protected BranchAndFinancialInstitutionIdentification5 originalDebtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor agent that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAgent
	 * AmendmentInformationDetails10.mmOriginalDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<BranchAndFinancialInstitutionIdentification5>> mmOriginalDebtorAgent = new MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgent";
			definition = "Original debtor agent that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtorAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalDebtorAgent();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setOriginalDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAgtAcct")
	protected CashAccount24 originalDebtorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor agent account that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAgentAccount
	 * AmendmentInformationDetails10.mmOriginalDebtorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<CashAccount24>> mmOriginalDebtorAgentAccount = new MMMessageAssociationEnd<AmendmentInformationDetails8, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgentAccount";
			definition = "Original debtor agent account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtorAgentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalDebtorAgentAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<CashAccount24> value) {
			obj.setOriginalDebtorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlFnlColltnDt")
	protected ISODate originalFinalCollectionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
	 * DirectDebitMandate.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFnlColltnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original final collection date that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails10.mmOriginalFinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails8, Optional<ISODate>> mmOriginalFinalCollectionDate = new MMMessageAttribute<AmendmentInformationDetails8, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFnlColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFinalCollectionDate";
			definition = "Original final collection date that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalFinalCollectionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalFinalCollectionDate();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<ISODate> value) {
			obj.setOriginalFinalCollectionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlFrqcy")
	protected Frequency6Code originalFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency6Code
	 * Frequency6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFrqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original frequency that has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFrequency
	 * AmendmentInformationDetails10.mmOriginalFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails8, Optional<Frequency6Code>> mmOriginalFrequency = new MMMessageAttribute<AmendmentInformationDetails8, Optional<Frequency6Code>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFrequency";
			definition = "Original frequency that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalFrequency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency6Code.mmObject();
		}

		@Override
		public Optional<Frequency6Code> getValue(AmendmentInformationDetails8 obj) {
			return obj.getOriginalFrequency();
		}

		@Override
		public void setValue(AmendmentInformationDetails8 obj, Optional<Frequency6Code> value) {
			obj.setOriginalFrequency(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalMandateIdentification,
						com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalCreditorSchemeIdentification, com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalCreditorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalCreditorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtor,
						com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalFinalCollectionDate,
						com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalFrequency);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendmentInformationDetails8";
				definition = "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set.";
				nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getOriginalMandateIdentification() {
		return originalMandateIdentification == null ? Optional.empty() : Optional.of(originalMandateIdentification);
	}

	public AmendmentInformationDetails8 setOriginalMandateIdentification(Max35Text originalMandateIdentification) {
		this.originalMandateIdentification = originalMandateIdentification;
		return this;
	}

	public Optional<PartyIdentification43> getOriginalCreditorSchemeIdentification() {
		return originalCreditorSchemeIdentification == null ? Optional.empty() : Optional.of(originalCreditorSchemeIdentification);
	}

	public AmendmentInformationDetails8 setOriginalCreditorSchemeIdentification(PartyIdentification43 originalCreditorSchemeIdentification) {
		this.originalCreditorSchemeIdentification = originalCreditorSchemeIdentification;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getOriginalCreditorAgent() {
		return originalCreditorAgent == null ? Optional.empty() : Optional.of(originalCreditorAgent);
	}

	public AmendmentInformationDetails8 setOriginalCreditorAgent(BranchAndFinancialInstitutionIdentification5 originalCreditorAgent) {
		this.originalCreditorAgent = originalCreditorAgent;
		return this;
	}

	public Optional<CashAccount24> getOriginalCreditorAgentAccount() {
		return originalCreditorAgentAccount == null ? Optional.empty() : Optional.of(originalCreditorAgentAccount);
	}

	public AmendmentInformationDetails8 setOriginalCreditorAgentAccount(CashAccount24 originalCreditorAgentAccount) {
		this.originalCreditorAgentAccount = originalCreditorAgentAccount;
		return this;
	}

	public Optional<PartyIdentification43> getOriginalDebtor() {
		return originalDebtor == null ? Optional.empty() : Optional.of(originalDebtor);
	}

	public AmendmentInformationDetails8 setOriginalDebtor(PartyIdentification43 originalDebtor) {
		this.originalDebtor = originalDebtor;
		return this;
	}

	public Optional<CashAccount24> getOriginalDebtorAccount() {
		return originalDebtorAccount == null ? Optional.empty() : Optional.of(originalDebtorAccount);
	}

	public AmendmentInformationDetails8 setOriginalDebtorAccount(CashAccount24 originalDebtorAccount) {
		this.originalDebtorAccount = originalDebtorAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getOriginalDebtorAgent() {
		return originalDebtorAgent == null ? Optional.empty() : Optional.of(originalDebtorAgent);
	}

	public AmendmentInformationDetails8 setOriginalDebtorAgent(BranchAndFinancialInstitutionIdentification5 originalDebtorAgent) {
		this.originalDebtorAgent = originalDebtorAgent;
		return this;
	}

	public Optional<CashAccount24> getOriginalDebtorAgentAccount() {
		return originalDebtorAgentAccount == null ? Optional.empty() : Optional.of(originalDebtorAgentAccount);
	}

	public AmendmentInformationDetails8 setOriginalDebtorAgentAccount(CashAccount24 originalDebtorAgentAccount) {
		this.originalDebtorAgentAccount = originalDebtorAgentAccount;
		return this;
	}

	public Optional<ISODate> getOriginalFinalCollectionDate() {
		return originalFinalCollectionDate == null ? Optional.empty() : Optional.of(originalFinalCollectionDate);
	}

	public AmendmentInformationDetails8 setOriginalFinalCollectionDate(ISODate originalFinalCollectionDate) {
		this.originalFinalCollectionDate = originalFinalCollectionDate;
		return this;
	}

	public Optional<Frequency6Code> getOriginalFrequency() {
		return originalFrequency == null ? Optional.empty() : Optional.of(originalFrequency);
	}

	public AmendmentInformationDetails8 setOriginalFrequency(Frequency6Code originalFrequency) {
		this.originalFrequency = originalFrequency;
		return this;
	}
}