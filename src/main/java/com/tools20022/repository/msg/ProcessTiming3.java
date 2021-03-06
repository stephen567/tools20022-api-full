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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters defining the timing conditions to process an action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmWaitingTime
 * ProcessTiming3.mmWaitingTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmStartTime
 * ProcessTiming3.mmStartTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmEndTime
 * ProcessTiming3.mmEndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmPeriod
 * ProcessTiming3.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmMaximumNumber
 * ProcessTiming3.mmMaximumNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessTiming3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters defining the timing conditions to process an action."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming4 ProcessTiming4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ProcessTiming2
 * ProcessTiming2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProcessTiming3", propOrder = {"waitingTime", "startTime", "endTime", "period", "maximumNumber"})
public class ProcessTiming3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "WtgTm")
	protected Max9NumericText waitingTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming3 ProcessTiming3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WtgTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Waiting time after the previous action in months, days, hours and minutes, leading zeros could be omitted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2#mmWaitingTime
	 * ProcessTiming2.mmWaitingTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessTiming3, Optional<Max9NumericText>> mmWaitingTime = new MMMessageAttribute<ProcessTiming3, Optional<Max9NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
			isDerived = false;
			xmlTag = "WtgTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingTime";
			definition = "Waiting time after the previous action in months, days, hours and minutes, leading zeros could be omitted.";
			previousVersion_lazy = () -> ProcessTiming2.mmWaitingTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Optional<Max9NumericText> getValue(ProcessTiming3 obj) {
			return obj.getWaitingTime();
		}

		@Override
		public void setValue(ProcessTiming3 obj, Optional<Max9NumericText> value) {
			obj.setWaitingTime(value.orElse(null));
		}
	};
	@XmlElement(name = "StartTm")
	protected ISODateTime startTime;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming3 ProcessTiming3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time to start the action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming4#mmStartTime
	 * ProcessTiming4.mmStartTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2#mmStartTime
	 * ProcessTiming2.mmStartTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessTiming3, Optional<ISODateTime>> mmStartTime = new MMMessageAttribute<ProcessTiming3, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
			isDerived = false;
			xmlTag = "StartTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartTime";
			definition = "Date and time to start the action.";
			nextVersions_lazy = () -> Arrays.asList(ProcessTiming4.mmStartTime);
			previousVersion_lazy = () -> ProcessTiming2.mmStartTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ProcessTiming3 obj) {
			return obj.getStartTime();
		}

		@Override
		public void setValue(ProcessTiming3 obj, Optional<ISODateTime> value) {
			obj.setStartTime(value.orElse(null));
		}
	};
	@XmlElement(name = "EndTm")
	protected ISODateTime endTime;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming3 ProcessTiming3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time after which the action cannot be processed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming4#mmEndTime
	 * ProcessTiming4.mmEndTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2#mmEndTime
	 * ProcessTiming2.mmEndTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessTiming3, Optional<ISODateTime>> mmEndTime = new MMMessageAttribute<ProcessTiming3, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
			isDerived = false;
			xmlTag = "EndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndTime";
			definition = "Date and time after which the action cannot be processed.";
			nextVersions_lazy = () -> Arrays.asList(ProcessTiming4.mmEndTime);
			previousVersion_lazy = () -> ProcessTiming2.mmEndTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ProcessTiming3 obj) {
			return obj.getEndTime();
		}

		@Override
		public void setValue(ProcessTiming3 obj, Optional<ISODateTime> value) {
			obj.setEndTime(value.orElse(null));
		}
	};
	@XmlElement(name = "Prd")
	protected Max9NumericText period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming3 ProcessTiming3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period delay between cyclic action activation in months, days, hours and minutes, leading zeros could be omitted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming4#mmPeriod
	 * ProcessTiming4.mmPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2#mmPeriod
	 * ProcessTiming2.mmPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessTiming3, Optional<Max9NumericText>> mmPeriod = new MMMessageAttribute<ProcessTiming3, Optional<Max9NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Period delay between cyclic action activation in months, days, hours and minutes, leading zeros could be omitted.";
			nextVersions_lazy = () -> Arrays.asList(ProcessTiming4.mmPeriod);
			previousVersion_lazy = () -> ProcessTiming2.mmPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Optional<Max9NumericText> getValue(ProcessTiming3 obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(ProcessTiming3 obj, Optional<Max9NumericText> value) {
			obj.setPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxNb")
	protected Number maximumNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming3 ProcessTiming3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of cyclic calls."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2#mmMaximumNumber
	 * ProcessTiming2.mmMaximumNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessTiming3, Optional<Number>> mmMaximumNumber = new MMMessageAttribute<ProcessTiming3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of cyclic calls.";
			previousVersion_lazy = () -> ProcessTiming2.mmMaximumNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ProcessTiming3 obj) {
			return obj.getMaximumNumber();
		}

		@Override
		public void setValue(ProcessTiming3 obj, Optional<Number> value) {
			obj.setMaximumNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessTiming3.mmWaitingTime, com.tools20022.repository.msg.ProcessTiming3.mmStartTime, com.tools20022.repository.msg.ProcessTiming3.mmEndTime,
						com.tools20022.repository.msg.ProcessTiming3.mmPeriod, com.tools20022.repository.msg.ProcessTiming3.mmMaximumNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessTiming3";
				definition = "Parameters defining the timing conditions to process an action.";
				nextVersions_lazy = () -> Arrays.asList(ProcessTiming4.mmObject());
				previousVersion_lazy = () -> ProcessTiming2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max9NumericText> getWaitingTime() {
		return waitingTime == null ? Optional.empty() : Optional.of(waitingTime);
	}

	public ProcessTiming3 setWaitingTime(Max9NumericText waitingTime) {
		this.waitingTime = waitingTime;
		return this;
	}

	public Optional<ISODateTime> getStartTime() {
		return startTime == null ? Optional.empty() : Optional.of(startTime);
	}

	public ProcessTiming3 setStartTime(ISODateTime startTime) {
		this.startTime = startTime;
		return this;
	}

	public Optional<ISODateTime> getEndTime() {
		return endTime == null ? Optional.empty() : Optional.of(endTime);
	}

	public ProcessTiming3 setEndTime(ISODateTime endTime) {
		this.endTime = endTime;
		return this;
	}

	public Optional<Max9NumericText> getPeriod() {
		return period == null ? Optional.empty() : Optional.of(period);
	}

	public ProcessTiming3 setPeriod(Max9NumericText period) {
		this.period = period;
		return this;
	}

	public Optional<Number> getMaximumNumber() {
		return maximumNumber == null ? Optional.empty() : Optional.of(maximumNumber);
	}

	public ProcessTiming3 setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
		return this;
	}
}