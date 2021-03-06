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
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on business day information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmSystemStatusIndicator
 * BusinessDayInformationReturnCriteria.mmSystemStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmEventIndicator
 * BusinessDayInformationReturnCriteria.mmEventIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmSessionPeriodIndicator
 * BusinessDayInformationReturnCriteria.mmSessionPeriodIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmClosureInformationIndicator
 * BusinessDayInformationReturnCriteria.mmClosureInformationIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayInformationReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria used to report on business day information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDayInformationReturnCriteria", propOrder = {"systemStatusIndicator", "eventIndicator", "sessionPeriodIndicator", "closureInformationIndicator"})
public class BusinessDayInformationReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysStsInd")
	protected RequestedIndicator systemStatusIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysStsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemStatusIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the system status is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>> mmSystemStatusIndicator = new MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "SysStsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemStatusIndicator";
			definition = "Indicates whether the system status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(BusinessDayInformationReturnCriteria obj) {
			return obj.getSystemStatusIndicator();
		}

		@Override
		public void setValue(BusinessDayInformationReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setSystemStatusIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtInd")
	protected RequestedIndicator eventIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the events are requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>> mmEventIndicator = new MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "EvtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIndicator";
			definition = "Indicates whether the events are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(BusinessDayInformationReturnCriteria obj) {
			return obj.getEventIndicator();
		}

		@Override
		public void setValue(BusinessDayInformationReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setEventIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SsnPrdInd")
	protected RequestedIndicator sessionPeriodIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SsnPrdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SessionPeriodIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the session period is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>> mmSessionPeriodIndicator = new MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "SsnPrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionPeriodIndicator";
			definition = "Indicates whether the session period is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(BusinessDayInformationReturnCriteria obj) {
			return obj.getSessionPeriodIndicator();
		}

		@Override
		public void setValue(BusinessDayInformationReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setSessionPeriodIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsrInfInd")
	protected RequestedIndicator closureInformationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrInfInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureInformationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the closure information is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>> mmClosureInformationIndicator = new MMMessageAttribute<BusinessDayInformationReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "ClsrInfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureInformationIndicator";
			definition = "Indicates whether the closure information is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(BusinessDayInformationReturnCriteria obj) {
			return obj.getClosureInformationIndicator();
		}

		@Override
		public void setValue(BusinessDayInformationReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setClosureInformationIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmSystemStatusIndicator, com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmEventIndicator,
						com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmSessionPeriodIndicator, com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmClosureInformationIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "BusinessDayInformationReturnCriteria";
				definition = "Defines the criteria used to report on business day information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getSystemStatusIndicator() {
		return systemStatusIndicator == null ? Optional.empty() : Optional.of(systemStatusIndicator);
	}

	public BusinessDayInformationReturnCriteria setSystemStatusIndicator(RequestedIndicator systemStatusIndicator) {
		this.systemStatusIndicator = systemStatusIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getEventIndicator() {
		return eventIndicator == null ? Optional.empty() : Optional.of(eventIndicator);
	}

	public BusinessDayInformationReturnCriteria setEventIndicator(RequestedIndicator eventIndicator) {
		this.eventIndicator = eventIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getSessionPeriodIndicator() {
		return sessionPeriodIndicator == null ? Optional.empty() : Optional.of(sessionPeriodIndicator);
	}

	public BusinessDayInformationReturnCriteria setSessionPeriodIndicator(RequestedIndicator sessionPeriodIndicator) {
		this.sessionPeriodIndicator = sessionPeriodIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getClosureInformationIndicator() {
		return closureInformationIndicator == null ? Optional.empty() : Optional.of(closureInformationIndicator);
	}

	public BusinessDayInformationReturnCriteria setClosureInformationIndicator(RequestedIndicator closureInformationIndicator) {
		this.closureInformationIndicator = closureInformationIndicator;
		return this;
	}
}