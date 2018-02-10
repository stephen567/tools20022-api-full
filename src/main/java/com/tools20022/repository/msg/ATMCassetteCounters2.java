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
import com.tools20022.repository.codeset.ATMCounterType1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Counters of media inside an ATM cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmType
 * ATMCassetteCounters2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmAddedNumber
 * ATMCassetteCounters2.mmAddedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmRemovedNumber
 * ATMCassetteCounters2.mmRemovedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmDispensedNumber
 * ATMCassetteCounters2.mmDispensedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmDepositNumber
 * ATMCassetteCounters2.mmDepositNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmRecycledNumber
 * ATMCassetteCounters2.mmRecycledNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmRetractedNumber
 * ATMCassetteCounters2.mmRetractedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmRejectedNumber
 * ATMCassetteCounters2.mmRejectedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2#mmPresentedNumber
 * ATMCassetteCounters2.mmPresentedNumber}</li>
 * </ul>
 * </li>
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
 * "ATMCassetteCounters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Counters of media inside an ATM cassette."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
 * ATMCassetteCounters1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCassetteCounters2", propOrder = {"type", "addedNumber", "removedNumber", "dispensedNumber", "depositNumber", "recycledNumber", "retractedNumber", "rejectedNumber", "presentedNumber"})
public class ATMCassetteCounters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected ATMCounterType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of counters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of counters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCounterType1Code.mmObject();
		}
	};
	@XmlElement(name = "AddedNb")
	protected Number addedNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddedNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of added media during servicing operations."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "AddedNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddedNumber";
			definition = "Number of added media during servicing operations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RmvdNb")
	protected Number removedNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmvdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of removed media during servicing operations."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemovedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "RmvdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovedNumber";
			definition = "Number of removed media during servicing operations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "DspnsdNb")
	protected Number dispensedNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DspnsdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispensedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of media out of the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDispensedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "DspnsdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispensedNumber";
			definition = "Total number of media out of the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "DpstNb")
	protected Number depositNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of media deposited in the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepositNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "DpstNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositNumber";
			definition = "Total number of media deposited in the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RcycldNb")
	protected Number recycledNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcycldNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecycledNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of recycled media from the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecycledNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "RcycldNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecycledNumber";
			definition = "Total number of recycled media from the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RtrctdNb")
	protected Number retractedNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrctdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetractedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of retracted media originating from the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRetractedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "RtrctdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetractedNumber";
			definition = "Total number of retracted media originating from the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RjctdNb")
	protected Number rejectedNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of media from this cassette which are on the reject bin."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "RjctdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedNumber";
			definition = "Total number of media from this cassette which are on the reject bin.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "PresntdNb")
	protected Number presentedNumber;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters2
	 * ATMCassetteCounters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PresntdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of media presented to the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPresentedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters2.mmObject();
			isDerived = false;
			xmlTag = "PresntdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentedNumber";
			definition = "Total number of media presented to the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCassetteCounters2.mmType, com.tools20022.repository.msg.ATMCassetteCounters2.mmAddedNumber,
						com.tools20022.repository.msg.ATMCassetteCounters2.mmRemovedNumber, com.tools20022.repository.msg.ATMCassetteCounters2.mmDispensedNumber, com.tools20022.repository.msg.ATMCassetteCounters2.mmDepositNumber,
						com.tools20022.repository.msg.ATMCassetteCounters2.mmRecycledNumber, com.tools20022.repository.msg.ATMCassetteCounters2.mmRetractedNumber, com.tools20022.repository.msg.ATMCassetteCounters2.mmRejectedNumber,
						com.tools20022.repository.msg.ATMCassetteCounters2.mmPresentedNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassetteCounters2";
				definition = "Counters of media inside an ATM cassette.";
				previousVersion_lazy = () -> ATMCassetteCounters1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMCounterType1Code getType() {
		return type;
	}

	public ATMCassetteCounters2 setType(ATMCounterType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Number> getAddedNumber() {
		return addedNumber == null ? Optional.empty() : Optional.of(addedNumber);
	}

	public ATMCassetteCounters2 setAddedNumber(Number addedNumber) {
		this.addedNumber = addedNumber;
		return this;
	}

	public Optional<Number> getRemovedNumber() {
		return removedNumber == null ? Optional.empty() : Optional.of(removedNumber);
	}

	public ATMCassetteCounters2 setRemovedNumber(Number removedNumber) {
		this.removedNumber = removedNumber;
		return this;
	}

	public Optional<Number> getDispensedNumber() {
		return dispensedNumber == null ? Optional.empty() : Optional.of(dispensedNumber);
	}

	public ATMCassetteCounters2 setDispensedNumber(Number dispensedNumber) {
		this.dispensedNumber = dispensedNumber;
		return this;
	}

	public Optional<Number> getDepositNumber() {
		return depositNumber == null ? Optional.empty() : Optional.of(depositNumber);
	}

	public ATMCassetteCounters2 setDepositNumber(Number depositNumber) {
		this.depositNumber = depositNumber;
		return this;
	}

	public Optional<Number> getRecycledNumber() {
		return recycledNumber == null ? Optional.empty() : Optional.of(recycledNumber);
	}

	public ATMCassetteCounters2 setRecycledNumber(Number recycledNumber) {
		this.recycledNumber = recycledNumber;
		return this;
	}

	public Optional<Number> getRetractedNumber() {
		return retractedNumber == null ? Optional.empty() : Optional.of(retractedNumber);
	}

	public ATMCassetteCounters2 setRetractedNumber(Number retractedNumber) {
		this.retractedNumber = retractedNumber;
		return this;
	}

	public Optional<Number> getRejectedNumber() {
		return rejectedNumber == null ? Optional.empty() : Optional.of(rejectedNumber);
	}

	public ATMCassetteCounters2 setRejectedNumber(Number rejectedNumber) {
		this.rejectedNumber = rejectedNumber;
		return this;
	}

	public Optional<Number> getPresentedNumber() {
		return presentedNumber == null ? Optional.empty() : Optional.of(presentedNumber);
	}

	public ATMCassetteCounters2 setPresentedNumber(Number presentedNumber) {
		this.presentedNumber = presentedNumber;
		return this;
	}
}