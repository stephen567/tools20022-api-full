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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.BusinessLetter1;
import com.tools20022.repository.msg.EncapsulatedBusinessMessage1;
import com.tools20022.repository.msg.FinancingItemList1;
import com.tools20022.repository.msgset.FactoringServicesISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The InvoiceAssignmentAcknowledgement message is sent from a trade partner to
 * communicate the status of payment obligations related to financial items. The
 * message can be sent independently or as a response to an
 * InvoiceAssignmentNotification message.<br>
 * Depending on legal contexts the message may be required as a response to an
 * InvoiceAssignmentNotification message in order for the assignment to become
 * effective.<br>
 * The trade party may include references to the corresponding items of an
 * InvoiceAssignmentRequest, InvoiceAssignmentStatus or
 * InvoiceAssignmentNotification or other messages and may include referenced
 * data.<br>
 * The message can carry digital signatures if required by context.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmHeader
 * InvoiceAssignmentAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmPaymentStatusList
 * InvoiceAssignmentAcknowledgementV01.mmPaymentStatusList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmPaymentStatusCount
 * InvoiceAssignmentAcknowledgementV01.mmPaymentStatusCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmItemCount
 * InvoiceAssignmentAcknowledgementV01.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmControlSum
 * InvoiceAssignmentAcknowledgementV01.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmAttachedMessage
 * InvoiceAssignmentAcknowledgementV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FactoringServicesISOLatestversion
 * FactoringServicesISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcAssgnmtAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.013.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceAssignmentAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The InvoiceAssignmentAcknowledgement message is sent from a trade partner to communicate the status of payment obligations related to financial items.  The message can be sent independently or as a response to an InvoiceAssignmentNotification message.\r\nDepending on legal contexts the message may be required as a response to an InvoiceAssignmentNotification message in order for the assignment to become effective.\r\nThe trade party may include references to the corresponding items of an InvoiceAssignmentRequest, InvoiceAssignmentStatus or InvoiceAssignmentNotification or other messages and may include referenced data.\r\nThe message can carry digital signatures if required by context."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceAssignmentAcknowledgementV01", propOrder = {"header", "paymentStatusList", "paymentStatusCount", "itemCount", "controlSum", "attachedMessage"})
public class InvoiceAssignmentAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected BusinessLetter1 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that unambiguously identify the status, common parameters, documents and identifications."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics that unambiguously identify the status, common parameters, documents and identifications.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BusinessLetter1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentAcknowledgementV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PmtStsList", required = true)
	protected List<FinancingItemList1> paymentStatusList;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtStsList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatusList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of payment status information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPaymentStatusList = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtStsList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatusList";
			definition = "List of payment status information.";
			minOccurs = 1;
			complexType_lazy = () -> FinancingItemList1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentAcknowledgementV01.class.getMethod("getPaymentStatusList", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PmtStsCnt")
	protected Max15NumericText paymentStatusCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtStsCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatusCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of payment information lists as control value."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPaymentStatusCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtStsCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatusCount";
			definition = "Number of payment information lists as control value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentAcknowledgementV01.class.getMethod("getPaymentStatusCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ItmCnt")
	protected Max15NumericText itemCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of individual items in all lists."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmItemCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Total number of individual items in all lists.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentAcknowledgementV01.class.getMethod("getItemCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in all lists, irrespective of currencies or direction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmControlSum = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in all lists, irrespective of currencies or direction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentAcknowledgementV01.class.getMethod("getControlSum", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AttchdMsg")
	protected List<EncapsulatedBusinessMessage1> attachedMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Referenced or related business message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAttachedMessage = new MMMessageBuildingBlock() {
		{
			xmlTag = "AttchdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedMessage";
			definition = "Referenced or related business message.";
			minOccurs = 0;
			complexType_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceAssignmentAcknowledgementV01.class.getMethod("getAttachedMessage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceAssignmentAcknowledgementV01";
				definition = "The InvoiceAssignmentAcknowledgement message is sent from a trade partner to communicate the status of payment obligations related to financial items.  The message can be sent independently or as a response to an InvoiceAssignmentNotification message.\r\nDepending on legal contexts the message may be required as a response to an InvoiceAssignmentNotification message in order for the assignment to become effective.\r\nThe trade party may include references to the corresponding items of an InvoiceAssignmentRequest, InvoiceAssignmentStatus or InvoiceAssignmentNotification or other messages and may include referenced data.\r\nThe message can carry digital signatures if required by context.";
				messageSet_lazy = () -> Arrays.asList(FactoringServicesISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InvcAssgnmtAck";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01.mmHeader, com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01.mmPaymentStatusList,
						com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01.mmPaymentStatusCount, com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01.mmItemCount,
						com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01.mmControlSum, com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01.mmAttachedMessage);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "013";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceAssignmentAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessLetter1 getHeader() {
		return header;
	}

	public InvoiceAssignmentAcknowledgementV01 setHeader(BusinessLetter1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public List<FinancingItemList1> getPaymentStatusList() {
		return paymentStatusList == null ? paymentStatusList = new ArrayList<>() : paymentStatusList;
	}

	public InvoiceAssignmentAcknowledgementV01 setPaymentStatusList(List<FinancingItemList1> paymentStatusList) {
		this.paymentStatusList = Objects.requireNonNull(paymentStatusList);
		return this;
	}

	public Optional<Max15NumericText> getPaymentStatusCount() {
		return paymentStatusCount == null ? Optional.empty() : Optional.of(paymentStatusCount);
	}

	public InvoiceAssignmentAcknowledgementV01 setPaymentStatusCount(Max15NumericText paymentStatusCount) {
		this.paymentStatusCount = paymentStatusCount;
		return this;
	}

	public Optional<Max15NumericText> getItemCount() {
		return itemCount == null ? Optional.empty() : Optional.of(itemCount);
	}

	public InvoiceAssignmentAcknowledgementV01 setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public InvoiceAssignmentAcknowledgementV01 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public List<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return attachedMessage == null ? attachedMessage = new ArrayList<>() : attachedMessage;
	}

	public InvoiceAssignmentAcknowledgementV01 setAttachedMessage(List<EncapsulatedBusinessMessage1> attachedMessage) {
		this.attachedMessage = Objects.requireNonNull(attachedMessage);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01")
	static public class Document {
		@XmlElement(name = "InvcAssgnmtAck", required = true)
		public InvoiceAssignmentAcknowledgementV01 messageBody;
	}
}