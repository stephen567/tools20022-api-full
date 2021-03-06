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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.BankAccountManagementISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The AccountExcludedMandateMaintenanceRequest message is sent from an
 * organisation to a financial institution as part of the account maintenance
 * process. It is the initial request message to update an account. Usage: this
 * update is about account details excluding any mandate information.<br>
 * If modification codes are not used: the organisation will specify under the
 * “Account” and “Organisation” tags the complete information as it should be in
 * the financial institution’s records after processing the update request. <br>
 * If modification codes are used (in that case, they must be used everywhere):
 * the organisation will specify under the “Account” and “Organisation” tags
 * which elements must be added, deleted, modified, or if they are unchanged.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.015.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmReferences
 * AccountExcludedMandateMaintenanceRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmFrom
 * AccountExcludedMandateMaintenanceRequestV02.mmFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmContractDates
 * AccountExcludedMandateMaintenanceRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmUnderlyingMasterAgreement
 * AccountExcludedMandateMaintenanceRequestV02.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmAccount
 * AccountExcludedMandateMaintenanceRequestV02.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmAccountServicerIdentification
 * AccountExcludedMandateMaintenanceRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmOrganisation
 * AccountExcludedMandateMaintenanceRequestV02.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmAdditionalMessageInformation
 * AccountExcludedMandateMaintenanceRequestV02.mmAdditionalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmDigitalSignature
 * AccountExcludedMandateMaintenanceRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmSupplementaryData
 * AccountExcludedMandateMaintenanceRequestV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.BankAccountManagementISOLatestversion
 * BankAccountManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctExcldMndtMntncReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountExcludedMandateMaintenanceRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountExcludedMandateMaintenanceRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is the initial request message to update an account. Usage: this update is about account details excluding any mandate information.\r\nIf modification codes are not used: the organisation will specify under the “Account” and “Organisation” tags the complete information as it should be in the financial institution’s records after processing the update request. \r\nIf modification codes are used (in that case, they must be used everywhere): the organisation will specify under the “Account” and “Organisation” tags which elements must be added, deleted, modified, or if they are unchanged."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01
 * AccountExcludedMandateMaintenanceRequestV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountExcludedMandateMaintenanceRequestV02", propOrder = {"references", "from", "contractDates", "underlyingMasterAgreement", "account", "accountServicerIdentification", "organisation", "additionalMessageInformation",
		"digitalSignature", "supplementaryData"})
public class AccountExcludedMandateMaintenanceRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs", required = true)
	protected References4 references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References4
	 * References4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements for the identification of the message and related references."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, References4> mmReferences = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, References4>() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements for the identification of the message and related references.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> References4.mmObject();
		}

		@Override
		public References4 getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, References4 value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "Fr")
	protected OrganisationIdentification8 from;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<OrganisationIdentification8>> mmFrom = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<OrganisationIdentification8>>() {
		{
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OrganisationIdentification8.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification8> getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getFrom();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, Optional<OrganisationIdentification8> value) {
			obj.setFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctDts")
	protected AccountContract2 contractDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract2
	 * AccountContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies target dates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<AccountContract2>> mmContractDates = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<AccountContract2>>() {
		{
			xmlTag = "CtrctDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates";
			definition = "Specifies target dates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountContract2.mmObject();
		}

		@Override
		public Optional<AccountContract2> getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getContractDates();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, Optional<AccountContract2> value) {
			obj.setContractDates(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygMstrAgrmt")
	protected ContractDocument1 underlyingMasterAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygMstrAgrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<ContractDocument1>> mmUnderlyingMasterAgreement = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<ContractDocument1>>() {
		{
			xmlTag = "UndrlygMstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingMasterAgreement";
			definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContractDocument1.mmObject();
		}

		@Override
		public Optional<ContractDocument1> getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getUnderlyingMasterAgreement();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, Optional<ContractDocument1> value) {
			obj.setUnderlyingMasterAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "Acct", required = true)
	protected CustomerAccountModification1 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1
	 * CustomerAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, CustomerAccountModification1> mmAccount = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, CustomerAccountModification1>() {
		{
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique and unambiguous identification of the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CustomerAccountModification1.mmObject();
		}

		@Override
		public CustomerAccountModification1 getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, CustomerAccountModification1 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "AcctSvcrId", required = true)
	protected BranchAndFinancialInstitutionIdentification5 accountServicerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, BranchAndFinancialInstitutionIdentification5> mmAccountServicerIdentification = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, BranchAndFinancialInstitutionIdentification5>() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getAccountServicerIdentification();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setAccountServicerIdentification(value);
		}
	};
	@XmlElement(name = "Org", required = true)
	protected OrganisationModification1 organisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1
	 * OrganisationModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Org"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, OrganisationModification1> mmOrganisation = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, OrganisationModification1>() {
		{
			xmlTag = "Org";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Organisation";
			definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrganisationModification1.mmObject();
		}

		@Override
		public OrganisationModification1 getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getOrganisation();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, OrganisationModification1 value) {
			obj.setOrganisation(value);
		}
	};
	@XmlElement(name = "AddtlMsgInf")
	protected AdditionalInformation5 additionalMessageInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation5
	 * AdditionalInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlMsgInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalMessageInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contains additional information related to the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<AdditionalInformation5>> mmAdditionalMessageInformation = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, Optional<AdditionalInformation5>>() {
		{
			xmlTag = "AddtlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalMessageInformation";
			definition = "Contains additional information related to the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalInformation5.mmObject();
		}

		@Override
		public Optional<AdditionalInformation5> getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getAdditionalMessageInformation();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, Optional<AdditionalInformation5> value) {
			obj.setAdditionalMessageInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected List<PartyAndSignature2> digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the signature with its components, namely signed info, signature value, key info and the object."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, List<PartyAndSignature2>> mmDigitalSignature = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, List<PartyAndSignature2>>() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Contains the signature with its components, namely signed info, signature value, key info and the object.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		@Override
		public List<PartyAndSignature2> getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, List<PartyAndSignature2> value) {
			obj.setDigitalSignature(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<AccountExcludedMandateMaintenanceRequestV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AccountExcludedMandateMaintenanceRequestV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AccountExcludedMandateMaintenanceRequestV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountExcludedMandateMaintenanceRequestV02";
				definition = "The AccountExcludedMandateMaintenanceRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is the initial request message to update an account. Usage: this update is about account details excluding any mandate information.\r\nIf modification codes are not used: the organisation will specify under the “Account” and “Organisation” tags the complete information as it should be in the financial institution’s records after processing the update request. \r\nIf modification codes are used (in that case, they must be used everywhere): the organisation will specify under the “Account” and “Organisation” tags which elements must be added, deleted, modified, or if they are unchanged.";
				previousVersion_lazy = () -> AccountExcludedMandateMaintenanceRequestV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(BankAccountManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctExcldMndtMntncReq";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmReferences,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmFrom, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmContractDates,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmUnderlyingMasterAgreement, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmAccount,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmOrganisation,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmAdditionalMessageInformation, com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmDigitalSignature,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "015";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountExcludedMandateMaintenanceRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public References4 getReferences() {
		return references;
	}

	public AccountExcludedMandateMaintenanceRequestV02 setReferences(References4 references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Optional<OrganisationIdentification8> getFrom() {
		return from == null ? Optional.empty() : Optional.of(from);
	}

	public AccountExcludedMandateMaintenanceRequestV02 setFrom(OrganisationIdentification8 from) {
		this.from = from;
		return this;
	}

	public Optional<AccountContract2> getContractDates() {
		return contractDates == null ? Optional.empty() : Optional.of(contractDates);
	}

	public AccountExcludedMandateMaintenanceRequestV02 setContractDates(AccountContract2 contractDates) {
		this.contractDates = contractDates;
		return this;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return underlyingMasterAgreement == null ? Optional.empty() : Optional.of(underlyingMasterAgreement);
	}

	public AccountExcludedMandateMaintenanceRequestV02 setUnderlyingMasterAgreement(ContractDocument1 underlyingMasterAgreement) {
		this.underlyingMasterAgreement = underlyingMasterAgreement;
		return this;
	}

	public CustomerAccountModification1 getAccount() {
		return account;
	}

	public AccountExcludedMandateMaintenanceRequestV02 setAccount(CustomerAccountModification1 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public AccountExcludedMandateMaintenanceRequestV02 setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification5 accountServicerIdentification) {
		this.accountServicerIdentification = Objects.requireNonNull(accountServicerIdentification);
		return this;
	}

	public OrganisationModification1 getOrganisation() {
		return organisation;
	}

	public AccountExcludedMandateMaintenanceRequestV02 setOrganisation(OrganisationModification1 organisation) {
		this.organisation = Objects.requireNonNull(organisation);
		return this;
	}

	public Optional<AdditionalInformation5> getAdditionalMessageInformation() {
		return additionalMessageInformation == null ? Optional.empty() : Optional.of(additionalMessageInformation);
	}

	public AccountExcludedMandateMaintenanceRequestV02 setAdditionalMessageInformation(AdditionalInformation5 additionalMessageInformation) {
		this.additionalMessageInformation = additionalMessageInformation;
		return this;
	}

	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public AccountExcludedMandateMaintenanceRequestV02 setDigitalSignature(List<PartyAndSignature2> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountExcludedMandateMaintenanceRequestV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.015.001.02")
	static public class Document {
		@XmlElement(name = "AcctExcldMndtMntncReq", required = true)
		public AccountExcludedMandateMaintenanceRequestV02 messageBody;
	}
}