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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemAvailabilityAndEvents2;
import com.tools20022.repository.msg.SystemStatus3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment system operational information, such as opening, closure, session
 * period or events, given per currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay7#mmSystemDate
 * BusinessDay7.mmSystemDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay7#mmSystemStatus
 * BusinessDay7.mmSystemStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDay7#mmSystemInformationPerCurrency
 * BusinessDay7.mmSystemInformationPerCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDay7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment system operational information, such as opening, closure, session period or events, given per currency."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.BusinessDay4
 * BusinessDay4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDay7", propOrder = {"systemDate", "systemStatus", "systemInformationPerCurrency"})
public class BusinessDay7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysDt")
	protected ISODate systemDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay7 BusinessDay7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date for which the availability information is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay4#mmSystemDate
	 * BusinessDay4.mmSystemDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDay7, Optional<ISODate>> mmSystemDate = new MMMessageAttribute<BusinessDay7, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDay7.mmObject();
			isDerived = false;
			xmlTag = "SysDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemDate";
			definition = "Date for which the availability information is provided.";
			previousVersion_lazy = () -> BusinessDay4.mmSystemDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(BusinessDay7 obj) {
			return obj.getSystemDate();
		}

		@Override
		public void setValue(BusinessDay7 obj, Optional<ISODate> value) {
			obj.setSystemDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SysSts")
	protected SystemStatus3 systemStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemStatus3
	 * SystemStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay7 BusinessDay7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a system and the period of time during which the status is valid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay4#mmSystemStatus
	 * BusinessDay4.mmSystemStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDay7, Optional<SystemStatus3>> mmSystemStatus = new MMMessageAssociationEnd<BusinessDay7, Optional<SystemStatus3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDay7.mmObject();
			isDerived = false;
			xmlTag = "SysSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemStatus";
			definition = "Status of a system and the period of time during which the status is valid.";
			previousVersion_lazy = () -> BusinessDay4.mmSystemStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemStatus3.mmObject();
		}

		@Override
		public Optional<SystemStatus3> getValue(BusinessDay7 obj) {
			return obj.getSystemStatus();
		}

		@Override
		public void setValue(BusinessDay7 obj, Optional<SystemStatus3> value) {
			obj.setSystemStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "SysInfPerCcy")
	protected List<SystemAvailabilityAndEvents2> systemInformationPerCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2
	 * SystemAvailabilityAndEvents2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay7 BusinessDay7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysInfPerCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInformationPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information relating to system operations and foreseen events relating to the operation of the system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay4#mmSystemInformationPerCurrency
	 * BusinessDay4.mmSystemInformationPerCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDay7, List<SystemAvailabilityAndEvents2>> mmSystemInformationPerCurrency = new MMMessageAssociationEnd<BusinessDay7, List<SystemAvailabilityAndEvents2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDay7.mmObject();
			isDerived = false;
			xmlTag = "SysInfPerCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInformationPerCurrency";
			definition = "Information relating to system operations and foreseen events relating to the operation of the system.";
			previousVersion_lazy = () -> BusinessDay4.mmSystemInformationPerCurrency;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemAvailabilityAndEvents2.mmObject();
		}

		@Override
		public List<SystemAvailabilityAndEvents2> getValue(BusinessDay7 obj) {
			return obj.getSystemInformationPerCurrency();
		}

		@Override
		public void setValue(BusinessDay7 obj, List<SystemAvailabilityAndEvents2> value) {
			obj.setSystemInformationPerCurrency(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDay7.mmSystemDate, com.tools20022.repository.msg.BusinessDay7.mmSystemStatus,
						com.tools20022.repository.msg.BusinessDay7.mmSystemInformationPerCurrency);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessDay7";
				definition = "Payment system operational information, such as opening, closure, session period or events, given per currency.";
				previousVersion_lazy = () -> BusinessDay4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getSystemDate() {
		return systemDate == null ? Optional.empty() : Optional.of(systemDate);
	}

	public BusinessDay7 setSystemDate(ISODate systemDate) {
		this.systemDate = systemDate;
		return this;
	}

	public Optional<SystemStatus3> getSystemStatus() {
		return systemStatus == null ? Optional.empty() : Optional.of(systemStatus);
	}

	public BusinessDay7 setSystemStatus(SystemStatus3 systemStatus) {
		this.systemStatus = systemStatus;
		return this;
	}

	public List<SystemAvailabilityAndEvents2> getSystemInformationPerCurrency() {
		return systemInformationPerCurrency == null ? systemInformationPerCurrency = new ArrayList<>() : systemInformationPerCurrency;
	}

	public BusinessDay7 setSystemInformationPerCurrency(List<SystemAvailabilityAndEvents2> systemInformationPerCurrency) {
		this.systemInformationPerCurrency = Objects.requireNonNull(systemInformationPerCurrency);
		return this;
	}
}