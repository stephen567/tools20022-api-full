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
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmAcquirerIdentification
 * AcquirerProtocolParameters1.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmApplicationIdentification
 * AcquirerProtocolParameters1.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmHost
 * AcquirerProtocolParameters1.mmHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmOnLineTransaction
 * AcquirerProtocolParameters1.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmOffLineTransaction
 * AcquirerProtocolParameters1.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmReconciliationExchange
 * AcquirerProtocolParameters1.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmReconciliationByAcquirer
 * AcquirerProtocolParameters1.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmTotalsPerCurrency
 * AcquirerProtocolParameters1.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmBatchTransferContent
 * AcquirerProtocolParameters1.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmMessageItem
 * AcquirerProtocolParameters1.mmMessageItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmProtectCardData
 * AcquirerProtocolParameters1.mmProtectCardData}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcquirerProtocolParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
 * AcquirerProtocolParameters3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerProtocolParameters1", propOrder = {"acquirerIdentification", "applicationIdentification", "host", "onLineTransaction", "offLineTransaction", "reconciliationExchange", "reconciliationByAcquirer",
		"totalsPerCurrency", "batchTransferContent", "messageItem", "protectCardData"})
public class AcquirerProtocolParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcqrrId", required = true)
	protected List<com.tools20022.repository.msg.GenericIdentification32> acquirerIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the acquirer using this protocol."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Identification of the acquirer using this protocol.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment application, user of the acquirer protocol."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application, user of the acquirer protocol.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Hst")
	protected List<com.tools20022.repository.msg.AcquirerHostConfiguration1> host;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration1
	 * AcquirerHostConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Host"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer host configuration."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHost = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "Hst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Acquirer host configuration.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerHostConfiguration1.mmObject();
		}
	};
	@XmlElement(name = "OnLineTx")
	protected AcquirerProtocolParameters2 onLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2
	 * AcquirerProtocolParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an online authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOnLineTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "OnLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an online authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters2.mmObject();
		}
	};
	@XmlElement(name = "OffLineTx")
	protected AcquirerProtocolParameters2 offLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2
	 * AcquirerProtocolParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffLineTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an offline authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOffLineTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "OffLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an offline authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters2.mmObject();
		}
	};
	@XmlElement(name = "RcncltnXchg")
	protected ExchangeConfiguration1 reconciliationExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1
	 * ExchangeConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of reconciliation exchanges."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationExchange = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "RcncltnXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationExchange";
			definition = "Configuration parameters of reconciliation exchanges.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnByAcqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationByAcquirer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmReconciliationByAcquirer;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "RcncltnByAcqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlsPerCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalsPerCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTotalsPerCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "TtlsPerCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrfCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchTransferContent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "BtchTrfCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			minOccurs = 0;
			simpleType_lazy = () -> BatchTransactionType1Code.mmObject();
		}
	};
	@XmlElement(name = "MsgItm")
	protected List<com.tools20022.repository.msg.MessageItemCondition1> messageItem;
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of a message item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageItem = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "MsgItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageItem";
			definition = "Configuration of a message item.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageItemCondition1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
	 * AcquirerProtocolParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectCardData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmProtectCardData;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters1.mmObject();
			isDerived = false;
			xmlTag = "PrtctCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.mmAcquirerIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmApplicationIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters1.mmHost, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters1.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmReconciliationExchange,
						com.tools20022.repository.msg.AcquirerProtocolParameters1.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmTotalsPerCurrency,
						com.tools20022.repository.msg.AcquirerProtocolParameters1.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmMessageItem,
						com.tools20022.repository.msg.AcquirerProtocolParameters1.mmProtectCardData);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters1";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<GenericIdentification32> getAcquirerIdentification() {
		return acquirerIdentification == null ? acquirerIdentification = new ArrayList<>() : acquirerIdentification;
	}

	public AcquirerProtocolParameters1 setAcquirerIdentification(List<com.tools20022.repository.msg.GenericIdentification32> acquirerIdentification) {
		this.acquirerIdentification = Objects.requireNonNull(acquirerIdentification);
		return this;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification == null ? applicationIdentification = new ArrayList<>() : applicationIdentification;
	}

	public AcquirerProtocolParameters1 setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public List<AcquirerHostConfiguration1> getHost() {
		return host == null ? host = new ArrayList<>() : host;
	}

	public AcquirerProtocolParameters1 setHost(List<com.tools20022.repository.msg.AcquirerHostConfiguration1> host) {
		this.host = Objects.requireNonNull(host);
		return this;
	}

	public Optional<AcquirerProtocolParameters2> getOnLineTransaction() {
		return onLineTransaction == null ? Optional.empty() : Optional.of(onLineTransaction);
	}

	public AcquirerProtocolParameters1 setOnLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters2 onLineTransaction) {
		this.onLineTransaction = onLineTransaction;
		return this;
	}

	public Optional<AcquirerProtocolParameters2> getOffLineTransaction() {
		return offLineTransaction == null ? Optional.empty() : Optional.of(offLineTransaction);
	}

	public AcquirerProtocolParameters1 setOffLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters2 offLineTransaction) {
		this.offLineTransaction = offLineTransaction;
		return this;
	}

	public Optional<ExchangeConfiguration1> getReconciliationExchange() {
		return reconciliationExchange == null ? Optional.empty() : Optional.of(reconciliationExchange);
	}

	public AcquirerProtocolParameters1 setReconciliationExchange(com.tools20022.repository.msg.ExchangeConfiguration1 reconciliationExchange) {
		this.reconciliationExchange = reconciliationExchange;
		return this;
	}

	public Optional<TrueFalseIndicator> getReconciliationByAcquirer() {
		return reconciliationByAcquirer == null ? Optional.empty() : Optional.of(reconciliationByAcquirer);
	}

	public AcquirerProtocolParameters1 setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
		return this;
	}

	public Optional<TrueFalseIndicator> getTotalsPerCurrency() {
		return totalsPerCurrency == null ? Optional.empty() : Optional.of(totalsPerCurrency);
	}

	public AcquirerProtocolParameters1 setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
		return this;
	}

	public List<BatchTransactionType1Code> getBatchTransferContent() {
		return batchTransferContent == null ? batchTransferContent = new ArrayList<>() : batchTransferContent;
	}

	public AcquirerProtocolParameters1 setBatchTransferContent(List<BatchTransactionType1Code> batchTransferContent) {
		this.batchTransferContent = Objects.requireNonNull(batchTransferContent);
		return this;
	}

	public List<MessageItemCondition1> getMessageItem() {
		return messageItem == null ? messageItem = new ArrayList<>() : messageItem;
	}

	public AcquirerProtocolParameters1 setMessageItem(List<com.tools20022.repository.msg.MessageItemCondition1> messageItem) {
		this.messageItem = Objects.requireNonNull(messageItem);
		return this;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public AcquirerProtocolParameters1 setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = Objects.requireNonNull(protectCardData);
		return this;
	}
}