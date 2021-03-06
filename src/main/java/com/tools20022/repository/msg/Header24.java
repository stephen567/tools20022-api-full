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
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.codeset.MessageFunction10Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification53;
import com.tools20022.repository.msg.GenericIdentification94;
import com.tools20022.repository.msg.Traceability5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics related to the protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header24#mmMessageFunction
 * Header24.mmMessageFunction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header24#mmProtocolVersion
 * Header24.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header24#mmExchangeIdentification
 * Header24.mmExchangeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header24#mmReTransmissionCounter
 * Header24.mmReTransmissionCounter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header24#mmCreationDateTime
 * Header24.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header24#mmInitiatingParty
 * Header24.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header24#mmRecipientParty
 * Header24.mmRecipientParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header24#mmTraceability
 * Header24.mmTraceability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV05#mmHeader
 * AcceptorCompletionAdviceV05.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV05#mmHeader
 * AcceptorCompletionAdviceResponseV05.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV05#mmHeader
 * AcceptorCancellationAdviceResponseV05.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV05#mmHeader
 * AcceptorCancellationAdviceV05.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV06#mmHeader
 * AcceptorCompletionAdviceResponseV06.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06#mmHeader
 * AcceptorCancellationAdviceV06.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV06#mmHeader
 * AcceptorCompletionAdviceV06.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06#mmHeader
 * AcceptorCancellationAdviceResponseV06.mmHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Header24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of characteristics related to the protocol."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header34 Header34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header36 Header36}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Header11
 * Header11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Header24", propOrder = {"messageFunction", "protocolVersion", "exchangeIdentification", "reTransmissionCounter", "creationDateTime", "initiatingParty", "recipientParty", "traceability"})
public class Header24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgFctn", required = true)
	protected MessageFunction10Code messageFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgFctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of process related to the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header34#mmMessageFunction
	 * Header34.mmMessageFunction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header36#mmMessageFunction
	 * Header36.mmMessageFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmMessageFunction
	 * Header11.mmMessageFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header24, MessageFunction10Code> mmMessageFunction = new MMMessageAttribute<Header24, MessageFunction10Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "MsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageFunction";
			definition = "Identifies the type of process related to the message.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmMessageFunction, Header36.mmMessageFunction);
			previousVersion_lazy = () -> Header11.mmMessageFunction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageFunction10Code.mmObject();
		}

		@Override
		public MessageFunction10Code getValue(Header24 obj) {
			return obj.getMessageFunction();
		}

		@Override
		public void setValue(Header24 obj, MessageFunction10Code value) {
			obj.setMessageFunction(value);
		}
	};
	@XmlElement(name = "PrtcolVrsn", required = true)
	protected Max6Text protocolVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcolVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the acquirer protocol specifications."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header34#mmProtocolVersion
	 * Header34.mmProtocolVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header36#mmProtocolVersion
	 * Header36.mmProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmProtocolVersion
	 * Header11.mmProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header24, Max6Text> mmProtocolVersion = new MMMessageAttribute<Header24, Max6Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "PrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the acquirer protocol specifications.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmProtocolVersion, Header36.mmProtocolVersion);
			previousVersion_lazy = () -> Header11.mmProtocolVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Max6Text getValue(Header24 obj) {
			return obj.getProtocolVersion();
		}

		@Override
		public void setValue(Header24 obj, Max6Text value) {
			obj.setProtocolVersion(value);
		}
	};
	@XmlElement(name = "XchgId", required = true)
	protected Number exchangeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of an exchange occurrence."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header34#mmExchangeIdentification
	 * Header34.mmExchangeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header36#mmExchangeIdentification
	 * Header36.mmExchangeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmExchangeIdentification
	 * Header11.mmExchangeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header24, Number> mmExchangeIdentification = new MMMessageAttribute<Header24, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "XchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeIdentification";
			definition = "Unique identification of an exchange occurrence.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmExchangeIdentification, Header36.mmExchangeIdentification);
			previousVersion_lazy = () -> Header11.mmExchangeIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Header24 obj) {
			return obj.getExchangeIdentification();
		}

		@Override
		public void setValue(Header24 obj, Number value) {
			obj.setExchangeIdentification(value);
		}
	};
	@XmlElement(name = "ReTrnsmssnCntr")
	protected Max3NumericText reTransmissionCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTrnsmssnCntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTransmissionCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of retransmissions of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header34#mmReTransmissionCounter
	 * Header34.mmReTransmissionCounter}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header36#mmReTransmissionCounter
	 * Header36.mmReTransmissionCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmReTransmissionCounter
	 * Header11.mmReTransmissionCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header24, Optional<Max3NumericText>> mmReTransmissionCounter = new MMMessageAttribute<Header24, Optional<Max3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "ReTrnsmssnCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTransmissionCounter";
			definition = "Number of retransmissions of the message.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmReTransmissionCounter, Header36.mmReTransmissionCounter);
			previousVersion_lazy = () -> Header11.mmReTransmissionCounter;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(Header24 obj) {
			return obj.getReTransmissionCounter();
		}

		@Override
		public void setValue(Header24 obj, Optional<Max3NumericText> value) {
			obj.setReTransmissionCounter(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header34#mmCreationDateTime
	 * Header34.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header36#mmCreationDateTime
	 * Header36.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmCreationDateTime
	 * Header11.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header24, ISODateTime> mmCreationDateTime = new MMMessageAttribute<Header24, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmCreationDateTime, Header36.mmCreationDateTime);
			previousVersion_lazy = () -> Header11.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Header24 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(Header24 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "InitgPty", required = true)
	protected GenericIdentification53 initiatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that has initiated the exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header34#mmInitiatingParty
	 * Header34.mmInitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header36#mmInitiatingParty
	 * Header36.mmInitiatingParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmInitiatingParty
	 * Header11.mmInitiatingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Header24, GenericIdentification53> mmInitiatingParty = new MMMessageAssociationEnd<Header24, GenericIdentification53>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Unique identification of the partner that has initiated the exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmInitiatingParty, Header36.mmInitiatingParty);
			previousVersion_lazy = () -> Header11.mmInitiatingParty;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public GenericIdentification53 getValue(Header24 obj) {
			return obj.getInitiatingParty();
		}

		@Override
		public void setValue(Header24 obj, GenericIdentification53 value) {
			obj.setInitiatingParty(value);
		}
	};
	@XmlElement(name = "RcptPty")
	protected GenericIdentification94 recipientParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification94
	 * GenericIdentification94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that is the recipient of the message exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header34#mmRecipientParty
	 * Header34.mmRecipientParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header36#mmRecipientParty
	 * Header36.mmRecipientParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmRecipientParty
	 * Header11.mmRecipientParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Header24, Optional<GenericIdentification94>> mmRecipientParty = new MMMessageAssociationEnd<Header24, Optional<GenericIdentification94>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "RcptPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			definition = "Unique identification of the partner that is the recipient of the message exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmRecipientParty, Header36.mmRecipientParty);
			previousVersion_lazy = () -> Header11.mmRecipientParty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification94.mmObject();
		}

		@Override
		public Optional<GenericIdentification94> getValue(Header24 obj) {
			return obj.getRecipientParty();
		}

		@Override
		public void setValue(Header24 obj, Optional<GenericIdentification94> value) {
			obj.setRecipientParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability5> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Traceability5
	 * Traceability5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header24
	 * Header24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header34#mmTraceability
	 * Header34.mmTraceability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header36#mmTraceability
	 * Header36.mmTraceability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header11#mmTraceability
	 * Header11.mmTraceability}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header24, List<Traceability5>> mmTraceability = new MMMessageAttribute<Header24, List<Traceability5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header24.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
			nextVersions_lazy = () -> Arrays.asList(Header34.mmTraceability, Header36.mmTraceability);
			previousVersion_lazy = () -> Header11.mmTraceability;
			minOccurs = 0;
			complexType_lazy = () -> Traceability5.mmObject();
		}

		@Override
		public List<Traceability5> getValue(Header24 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(Header24 obj, List<Traceability5> value) {
			obj.setTraceability(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Header24.mmMessageFunction, com.tools20022.repository.msg.Header24.mmProtocolVersion, com.tools20022.repository.msg.Header24.mmExchangeIdentification,
						com.tools20022.repository.msg.Header24.mmReTransmissionCounter, com.tools20022.repository.msg.Header24.mmCreationDateTime, com.tools20022.repository.msg.Header24.mmInitiatingParty,
						com.tools20022.repository.msg.Header24.mmRecipientParty, com.tools20022.repository.msg.Header24.mmTraceability);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCompletionAdviceV05.mmHeader, AcceptorCompletionAdviceResponseV05.mmHeader, AcceptorCancellationAdviceResponseV05.mmHeader, AcceptorCancellationAdviceV05.mmHeader,
						AcceptorCompletionAdviceResponseV06.mmHeader, AcceptorCancellationAdviceV06.mmHeader, AcceptorCompletionAdviceV06.mmHeader, AcceptorCancellationAdviceResponseV06.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header24";
				definition = "Set of characteristics related to the protocol.";
				nextVersions_lazy = () -> Arrays.asList(Header34.mmObject(), Header36.mmObject());
				previousVersion_lazy = () -> Header11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public MessageFunction10Code getMessageFunction() {
		return messageFunction;
	}

	public Header24 setMessageFunction(MessageFunction10Code messageFunction) {
		this.messageFunction = Objects.requireNonNull(messageFunction);
		return this;
	}

	public Max6Text getProtocolVersion() {
		return protocolVersion;
	}

	public Header24 setProtocolVersion(Max6Text protocolVersion) {
		this.protocolVersion = Objects.requireNonNull(protocolVersion);
		return this;
	}

	public Number getExchangeIdentification() {
		return exchangeIdentification;
	}

	public Header24 setExchangeIdentification(Number exchangeIdentification) {
		this.exchangeIdentification = Objects.requireNonNull(exchangeIdentification);
		return this;
	}

	public Optional<Max3NumericText> getReTransmissionCounter() {
		return reTransmissionCounter == null ? Optional.empty() : Optional.of(reTransmissionCounter);
	}

	public Header24 setReTransmissionCounter(Max3NumericText reTransmissionCounter) {
		this.reTransmissionCounter = reTransmissionCounter;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public Header24 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public GenericIdentification53 getInitiatingParty() {
		return initiatingParty;
	}

	public Header24 setInitiatingParty(GenericIdentification53 initiatingParty) {
		this.initiatingParty = Objects.requireNonNull(initiatingParty);
		return this;
	}

	public Optional<GenericIdentification94> getRecipientParty() {
		return recipientParty == null ? Optional.empty() : Optional.of(recipientParty);
	}

	public Header24 setRecipientParty(GenericIdentification94 recipientParty) {
		this.recipientParty = recipientParty;
		return this;
	}

	public List<Traceability5> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public Header24 setTraceability(List<Traceability5> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}
}