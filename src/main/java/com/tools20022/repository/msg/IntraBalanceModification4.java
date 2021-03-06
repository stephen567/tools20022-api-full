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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ProcessingStatus71Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.IntraBalance3;
import com.tools20022.repository.msg.RequestDetails17;
import com.tools20022.repository.msg.SystemPartyIdentification6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of the modification requests.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmAccountOwner
 * IntraBalanceModification4.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmCashAccount
 * IntraBalanceModification4.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmProcessingStatus
 * IntraBalanceModification4.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmRequestReference
 * IntraBalanceModification4.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmStatusDate
 * IntraBalanceModification4.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmRequestDetails
 * IntraBalanceModification4.mmRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmUnderlyingIntraBalance
 * IntraBalanceModification4.mmUnderlyingIntraBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalanceModification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details of the modification requests."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2
 * IntraBalanceModification2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalanceModification4", propOrder = {"accountOwner", "cashAccount", "processingStatus", "requestReference", "statusDate", "requestDetails", "underlyingIntraBalance"})
public class IntraBalanceModification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr")
	protected SystemPartyIdentification6 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmPartyRole
	 * System.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4
	 * IntraBalanceModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmAccountOwner
	 * IntraBalanceModification2.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceModification4, Optional<SystemPartyIdentification6>> mmAccountOwner = new MMMessageAssociationEnd<IntraBalanceModification4, Optional<SystemPartyIdentification6>>() {
		{
			businessElementTrace_lazy = () -> System.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceModification4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that owns the account.";
			previousVersion_lazy = () -> IntraBalanceModification2.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification6.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification6> getValue(IntraBalanceModification4 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(IntraBalanceModification4 obj, Optional<SystemPartyIdentification6> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount24 cashAccount;
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
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4
	 * IntraBalanceModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmCashAccount
	 * IntraBalanceModification2.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceModification4, Optional<CashAccount24>> mmCashAccount = new MMMessageAssociationEnd<IntraBalanceModification4, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceModification4.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			previousVersion_lazy = () -> IntraBalanceModification2.mmCashAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(IntraBalanceModification4 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(IntraBalanceModification4 obj, Optional<CashAccount24> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus71Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus71Choice
	 * ProcessingStatus71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4
	 * IntraBalanceModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status and status reason of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:STAT [and 16R:REAS]</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmProcessingStatus
	 * IntraBalanceModification2.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceModification4, Optional<ProcessingStatus71Choice>> mmProcessingStatus = new MMMessageAssociationEnd<IntraBalanceModification4, Optional<ProcessingStatus71Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceModification4.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:STAT [and 16R:REAS]"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Status and status reason of the transaction.";
			previousVersion_lazy = () -> IntraBalanceModification2.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus71Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus71Choice> getValue(IntraBalanceModification4 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(IntraBalanceModification4 obj, Optional<ProcessingStatus71Choice> value) {
			obj.setProcessingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqRef", required = true)
	protected Max35Text requestReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4
	 * IntraBalanceModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the modification request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmRequestReference
	 * IntraBalanceModification2.mmRequestReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceModification4, Max35Text> mmRequestReference = new MMMessageAttribute<IntraBalanceModification4, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceModification4.mmObject();
			isDerived = false;
			xmlTag = "ReqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestReference";
			definition = "Unambiguous identification of the modification request.";
			previousVersion_lazy = () -> IntraBalanceModification2.mmRequestReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IntraBalanceModification4 obj) {
			return obj.getRequestReference();
		}

		@Override
		public void setValue(IntraBalanceModification4 obj, Max35Text value) {
			obj.setRequestReference(value);
		}
	};
	@XmlElement(name = "StsDt")
	protected ISODateTime statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4
	 * IntraBalanceModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmStatusDate
	 * IntraBalanceModification2.mmStatusDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceModification4, Optional<ISODateTime>> mmStatusDate = new MMMessageAttribute<IntraBalanceModification4, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceModification4.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			previousVersion_lazy = () -> IntraBalanceModification2.mmStatusDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(IntraBalanceModification4 obj) {
			return obj.getStatusDate();
		}

		@Override
		public void setValue(IntraBalanceModification4 obj, Optional<ISODateTime> value) {
			obj.setStatusDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqDtls")
	protected RequestDetails17 requestDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails17
	 * RequestDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4
	 * IntraBalanceModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the request providing the changes and references of the instruction for which the modification is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmRequestDetails
	 * IntraBalanceModification2.mmRequestDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceModification4, Optional<RequestDetails17>> mmRequestDetails = new MMMessageAttribute<IntraBalanceModification4, Optional<RequestDetails17>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceModification4.mmObject();
			isDerived = false;
			xmlTag = "ReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDetails";
			definition = "Details of the request providing the changes and references of the instruction for which the modification is requested.";
			previousVersion_lazy = () -> IntraBalanceModification2.mmRequestDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RequestDetails17.mmObject();
		}

		@Override
		public Optional<RequestDetails17> getValue(IntraBalanceModification4 obj) {
			return obj.getRequestDetails();
		}

		@Override
		public void setValue(IntraBalanceModification4 obj, Optional<RequestDetails17> value) {
			obj.setRequestDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygIntraBal")
	protected IntraBalance3 underlyingIntraBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IntraBalance3
	 * IntraBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4
	 * IntraBalanceModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygIntraBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingIntraBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies additional details of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:TRANSDET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmUnderlyingIntraBalance
	 * IntraBalanceModification2.mmUnderlyingIntraBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceModification4, Optional<IntraBalance3>> mmUnderlyingIntraBalance = new MMMessageAssociationEnd<IntraBalanceModification4, Optional<IntraBalance3>>() {
		{
			businessComponentTrace_lazy = () -> BookEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceModification4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygIntraBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:TRANSDET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingIntraBalance";
			definition = "Identifies additional details of the transaction.";
			previousVersion_lazy = () -> IntraBalanceModification2.mmUnderlyingIntraBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntraBalance3.mmObject();
		}

		@Override
		public Optional<IntraBalance3> getValue(IntraBalanceModification4 obj) {
			return obj.getUnderlyingIntraBalance();
		}

		@Override
		public void setValue(IntraBalanceModification4 obj, Optional<IntraBalance3> value) {
			obj.setUnderlyingIntraBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceModification4.mmAccountOwner, com.tools20022.repository.msg.IntraBalanceModification4.mmCashAccount,
						com.tools20022.repository.msg.IntraBalanceModification4.mmProcessingStatus, com.tools20022.repository.msg.IntraBalanceModification4.mmRequestReference,
						com.tools20022.repository.msg.IntraBalanceModification4.mmStatusDate, com.tools20022.repository.msg.IntraBalanceModification4.mmRequestDetails,
						com.tools20022.repository.msg.IntraBalanceModification4.mmUnderlyingIntraBalance);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceModification4";
				definition = "Provides the details of the modification requests.";
				previousVersion_lazy = () -> IntraBalanceModification2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemPartyIdentification6> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public IntraBalanceModification4 setAccountOwner(SystemPartyIdentification6 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<CashAccount24> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public IntraBalanceModification4 setCashAccount(CashAccount24 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public Optional<ProcessingStatus71Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public IntraBalanceModification4 setProcessingStatus(ProcessingStatus71Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Max35Text getRequestReference() {
		return requestReference;
	}

	public IntraBalanceModification4 setRequestReference(Max35Text requestReference) {
		this.requestReference = Objects.requireNonNull(requestReference);
		return this;
	}

	public Optional<ISODateTime> getStatusDate() {
		return statusDate == null ? Optional.empty() : Optional.of(statusDate);
	}

	public IntraBalanceModification4 setStatusDate(ISODateTime statusDate) {
		this.statusDate = statusDate;
		return this;
	}

	public Optional<RequestDetails17> getRequestDetails() {
		return requestDetails == null ? Optional.empty() : Optional.of(requestDetails);
	}

	public IntraBalanceModification4 setRequestDetails(RequestDetails17 requestDetails) {
		this.requestDetails = requestDetails;
		return this;
	}

	public Optional<IntraBalance3> getUnderlyingIntraBalance() {
		return underlyingIntraBalance == null ? Optional.empty() : Optional.of(underlyingIntraBalance);
	}

	public IntraBalanceModification4 setUnderlyingIntraBalance(IntraBalance3 underlyingIntraBalance) {
		this.underlyingIntraBalance = underlyingIntraBalance;
		return this;
	}
}