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
import com.tools20022.repository.codeset.BatchTransactionType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acceptor parameters dedicated to the acquirer protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmAcquirerIdentification
 * AcquirerProtocolParameters3.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmApplicationIdentification
 * AcquirerProtocolParameters3.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmHost
 * AcquirerProtocolParameters3.mmHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOnLineTransaction
 * AcquirerProtocolParameters3.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOffLineTransaction
 * AcquirerProtocolParameters3.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationExchange
 * AcquirerProtocolParameters3.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationByAcquirer
 * AcquirerProtocolParameters3.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmTotalsPerCurrency
 * AcquirerProtocolParameters3.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmSplitTotals
 * AcquirerProtocolParameters3.mmSplitTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmCardDataVerification
 * AcquirerProtocolParameters3.mmCardDataVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmBatchTransferContent
 * AcquirerProtocolParameters3.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmMessageItem
 * AcquirerProtocolParameters3.mmMessageItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmProtectCardData
 * AcquirerProtocolParameters3.mmProtectCardData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcquirerProtocolParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
 * AcquirerProtocolParameters6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
 * AcquirerProtocolParameters1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerProtocolParameters3", propOrder = {"acquirerIdentification", "applicationIdentification", "host", "onLineTransaction", "offLineTransaction", "reconciliationExchange", "reconciliationByAcquirer",
		"totalsPerCurrency", "splitTotals", "cardDataVerification", "batchTransferContent", "messageItem", "protectCardData"})
public class AcquirerProtocolParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcqrrId", required = true)
	protected List<GenericIdentification32> acquirerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the acquirer using this protocol."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmAcquirerIdentification
	 * AcquirerProtocolParameters6.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters3, List<GenericIdentification32>> mmAcquirerIdentification = new MMMessageAssociationEnd<AcquirerProtocolParameters3, List<GenericIdentification32>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Identification of the acquirer using this protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmAcquirerIdentification);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public List<GenericIdentification32> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getAcquirerIdentification();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, List<GenericIdentification32> value) {
			obj.setAcquirerIdentification(value);
		}
	};
	@XmlElement(name = "ApplId")
	protected List<Max35Text> applicationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationIdentification
	 * AcceptorConfiguration.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment application, user of the acquirer protocol."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmApplicationIdentification
	 * AcquirerProtocolParameters6.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters3, List<Max35Text>> mmApplicationIdentification = new MMMessageAttribute<AcquirerProtocolParameters3, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application, user of the acquirer protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmApplicationIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getApplicationIdentification();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, List<Max35Text> value) {
			obj.setApplicationIdentification(value);
		}
	};
	@XmlElement(name = "Hst")
	protected List<AcquirerHostConfiguration2> host;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration2
	 * AcquirerHostConfiguration2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Host"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer host configuration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmHost
	 * AcquirerProtocolParameters6.mmHost}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters3, List<AcquirerHostConfiguration2>> mmHost = new MMMessageAssociationEnd<AcquirerProtocolParameters3, List<AcquirerHostConfiguration2>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "Hst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Acquirer host configuration.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmHost);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AcquirerHostConfiguration2.mmObject();
		}

		@Override
		public List<AcquirerHostConfiguration2> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getHost();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, List<AcquirerHostConfiguration2> value) {
			obj.setHost(value);
		}
	};
	@XmlElement(name = "OnLineTx")
	protected AcquirerProtocolParameters4 onLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4
	 * AcquirerProtocolParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an online authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmOnLineTransaction
	 * AcquirerProtocolParameters6.mmOnLineTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters3, Optional<AcquirerProtocolParameters4>> mmOnLineTransaction = new MMMessageAssociationEnd<AcquirerProtocolParameters3, Optional<AcquirerProtocolParameters4>>() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "OnLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an online authorisation.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmOnLineTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AcquirerProtocolParameters4.mmObject();
		}

		@Override
		public Optional<AcquirerProtocolParameters4> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getOnLineTransaction();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, Optional<AcquirerProtocolParameters4> value) {
			obj.setOnLineTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "OffLineTx")
	protected AcquirerProtocolParameters4 offLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4
	 * AcquirerProtocolParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffLineTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an offline authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmOffLineTransaction
	 * AcquirerProtocolParameters6.mmOffLineTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters3, Optional<AcquirerProtocolParameters4>> mmOffLineTransaction = new MMMessageAssociationEnd<AcquirerProtocolParameters3, Optional<AcquirerProtocolParameters4>>() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "OffLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an offline authorisation.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmOffLineTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AcquirerProtocolParameters4.mmObject();
		}

		@Override
		public Optional<AcquirerProtocolParameters4> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getOffLineTransaction();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, Optional<AcquirerProtocolParameters4> value) {
			obj.setOffLineTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "RcncltnXchg")
	protected ExchangeConfiguration2 reconciliationExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2
	 * ExchangeConfiguration2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnXchg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of reconciliation exchanges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmReconciliationExchange
	 * AcquirerProtocolParameters6.mmReconciliationExchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters3, Optional<ExchangeConfiguration2>> mmReconciliationExchange = new MMMessageAssociationEnd<AcquirerProtocolParameters3, Optional<ExchangeConfiguration2>>() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "RcncltnXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationExchange";
			definition = "Configuration parameters of reconciliation exchanges.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmReconciliationExchange);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExchangeConfiguration2.mmObject();
		}

		@Override
		public Optional<ExchangeConfiguration2> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getReconciliationExchange();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, Optional<ExchangeConfiguration2> value) {
			obj.setReconciliationExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "RcncltnByAcqrr")
	protected TrueFalseIndicator reconciliationByAcquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmReconciliationByAcquirer
	 * AcceptorConfiguration.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnByAcqrr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters6.mmReconciliationByAcquirer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>> mmReconciliationByAcquirer = new MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmReconciliationByAcquirer;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "RcncltnByAcqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmReconciliationByAcquirer);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getReconciliationByAcquirer();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, Optional<TrueFalseIndicator> value) {
			obj.setReconciliationByAcquirer(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlsPerCcy")
	protected TrueFalseIndicator totalsPerCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTotalsPerCurrency
	 * AcceptorConfiguration.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlsPerCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmTotalsPerCurrency
	 * AcquirerProtocolParameters6.mmTotalsPerCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>> mmTotalsPerCurrency = new MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTotalsPerCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "TtlsPerCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmTotalsPerCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getTotalsPerCurrency();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, Optional<TrueFalseIndicator> value) {
			obj.setTotalsPerCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "SpltTtls")
	protected TrueFalseIndicator splitTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltTtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these informations are present in the transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmSplitTotals
	 * AcquirerProtocolParameters6.mmSplitTotals}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>> mmSplitTotals = new MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "SpltTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTotals";
			definition = "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these informations are present in the transactions.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmSplitTotals);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getSplitTotals();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, Optional<TrueFalseIndicator> value) {
			obj.setSplitTotals(value.orElse(null));
		}
	};
	@XmlElement(name = "CardDataVrfctn")
	protected TrueFalseIndicator cardDataVerification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardDataVrfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that response messages and an AcceptorCompletionAdvice message following an authorisation exchange must contain protected or plain card data."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmCardDataVerification
	 * AcquirerProtocolParameters6.mmCardDataVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>> mmCardDataVerification = new MMMessageAttribute<AcquirerProtocolParameters3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "CardDataVrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataVerification";
			definition = "Indicates that response messages and an AcceptorCompletionAdvice message following an authorisation exchange must contain protected or plain card data.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmCardDataVerification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getCardDataVerification();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, Optional<TrueFalseIndicator> value) {
			obj.setCardDataVerification(value.orElse(null));
		}
	};
	@XmlElement(name = "BtchTrfCntt")
	protected List<BatchTransactionType1Code> batchTransferContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionType1Code
	 * BatchTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
	 * AcceptorConfiguration.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrfCntt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmBatchTransferContent
	 * AcquirerProtocolParameters6.mmBatchTransferContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters3, List<BatchTransactionType1Code>> mmBatchTransferContent = new MMMessageAttribute<AcquirerProtocolParameters3, List<BatchTransactionType1Code>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "BtchTrfCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmBatchTransferContent);
			minOccurs = 0;
			simpleType_lazy = () -> BatchTransactionType1Code.mmObject();
		}

		@Override
		public List<BatchTransactionType1Code> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getBatchTransferContent();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, List<BatchTransactionType1Code> value) {
			obj.setBatchTransferContent(value);
		}
	};
	@XmlElement(name = "MsgItm")
	protected List<MessageItemCondition1> messageItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgItm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of a message item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmMessageItem
	 * AcquirerProtocolParameters6.mmMessageItem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters3, List<MessageItemCondition1>> mmMessageItem = new MMMessageAssociationEnd<AcquirerProtocolParameters3, List<MessageItemCondition1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "MsgItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageItem";
			definition = "Configuration of a message item.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmMessageItem);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MessageItemCondition1.mmObject();
		}

		@Override
		public List<MessageItemCondition1> getValue(AcquirerProtocolParameters3 obj) {
			return obj.getMessageItem();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, List<MessageItemCondition1> value) {
			obj.setMessageItem(value);
		}
	};
	@XmlElement(name = "PrtctCardData", required = true)
	protected TrueFalseIndicator protectCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmProtectCardData
	 * AcceptorConfiguration.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmProtectCardData
	 * AcquirerProtocolParameters6.mmProtectCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters3, TrueFalseIndicator> mmProtectCardData = new MMMessageAttribute<AcquirerProtocolParameters3, TrueFalseIndicator>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmProtectCardData;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "PrtctCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmProtectCardData);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AcquirerProtocolParameters3 obj) {
			return obj.getProtectCardData();
		}

		@Override
		public void setValue(AcquirerProtocolParameters3 obj, TrueFalseIndicator value) {
			obj.setProtectCardData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters3.mmAcquirerIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmApplicationIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmHost, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationExchange,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmTotalsPerCurrency,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmSplitTotals, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmCardDataVerification,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmMessageItem,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmProtectCardData);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters3";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmObject());
				previousVersion_lazy = () -> AcquirerProtocolParameters1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<GenericIdentification32> getAcquirerIdentification() {
		return acquirerIdentification == null ? acquirerIdentification = new ArrayList<>() : acquirerIdentification;
	}

	public AcquirerProtocolParameters3 setAcquirerIdentification(List<GenericIdentification32> acquirerIdentification) {
		this.acquirerIdentification = Objects.requireNonNull(acquirerIdentification);
		return this;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification == null ? applicationIdentification = new ArrayList<>() : applicationIdentification;
	}

	public AcquirerProtocolParameters3 setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public List<AcquirerHostConfiguration2> getHost() {
		return host == null ? host = new ArrayList<>() : host;
	}

	public AcquirerProtocolParameters3 setHost(List<AcquirerHostConfiguration2> host) {
		this.host = Objects.requireNonNull(host);
		return this;
	}

	public Optional<AcquirerProtocolParameters4> getOnLineTransaction() {
		return onLineTransaction == null ? Optional.empty() : Optional.of(onLineTransaction);
	}

	public AcquirerProtocolParameters3 setOnLineTransaction(AcquirerProtocolParameters4 onLineTransaction) {
		this.onLineTransaction = onLineTransaction;
		return this;
	}

	public Optional<AcquirerProtocolParameters4> getOffLineTransaction() {
		return offLineTransaction == null ? Optional.empty() : Optional.of(offLineTransaction);
	}

	public AcquirerProtocolParameters3 setOffLineTransaction(AcquirerProtocolParameters4 offLineTransaction) {
		this.offLineTransaction = offLineTransaction;
		return this;
	}

	public Optional<ExchangeConfiguration2> getReconciliationExchange() {
		return reconciliationExchange == null ? Optional.empty() : Optional.of(reconciliationExchange);
	}

	public AcquirerProtocolParameters3 setReconciliationExchange(ExchangeConfiguration2 reconciliationExchange) {
		this.reconciliationExchange = reconciliationExchange;
		return this;
	}

	public Optional<TrueFalseIndicator> getReconciliationByAcquirer() {
		return reconciliationByAcquirer == null ? Optional.empty() : Optional.of(reconciliationByAcquirer);
	}

	public AcquirerProtocolParameters3 setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
		return this;
	}

	public Optional<TrueFalseIndicator> getTotalsPerCurrency() {
		return totalsPerCurrency == null ? Optional.empty() : Optional.of(totalsPerCurrency);
	}

	public AcquirerProtocolParameters3 setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
		return this;
	}

	public Optional<TrueFalseIndicator> getSplitTotals() {
		return splitTotals == null ? Optional.empty() : Optional.of(splitTotals);
	}

	public AcquirerProtocolParameters3 setSplitTotals(TrueFalseIndicator splitTotals) {
		this.splitTotals = splitTotals;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardDataVerification() {
		return cardDataVerification == null ? Optional.empty() : Optional.of(cardDataVerification);
	}

	public AcquirerProtocolParameters3 setCardDataVerification(TrueFalseIndicator cardDataVerification) {
		this.cardDataVerification = cardDataVerification;
		return this;
	}

	public List<BatchTransactionType1Code> getBatchTransferContent() {
		return batchTransferContent == null ? batchTransferContent = new ArrayList<>() : batchTransferContent;
	}

	public AcquirerProtocolParameters3 setBatchTransferContent(List<BatchTransactionType1Code> batchTransferContent) {
		this.batchTransferContent = Objects.requireNonNull(batchTransferContent);
		return this;
	}

	public List<MessageItemCondition1> getMessageItem() {
		return messageItem == null ? messageItem = new ArrayList<>() : messageItem;
	}

	public AcquirerProtocolParameters3 setMessageItem(List<MessageItemCondition1> messageItem) {
		this.messageItem = Objects.requireNonNull(messageItem);
		return this;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public AcquirerProtocolParameters3 setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = Objects.requireNonNull(protectCardData);
		return this;
	}
}