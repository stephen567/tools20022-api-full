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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.RiskManagementLimit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LimitReport3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports on limits.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Limits3#mmCurrentLimit
 * Limits3.mmCurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits3#mmDefaultLimit
 * Limits3.mmDefaultLimit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Limits3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on limits."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Limits3", propOrder = {"currentLimit", "defaultLimit"})
public class Limits3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurLmt")
	protected List<LimitReport3> currentLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitReport3
	 * LimitReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limits3
	 * Limits3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurLmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report is given for a current risk management type limit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Limits3, List<LimitReport3>> mmCurrentLimit = new MMMessageAssociationEnd<Limits3, List<LimitReport3>>() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Limits3.mmObject();
			isDerived = false;
			xmlTag = "CurLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimit";
			definition = "Report is given for a current risk management type limit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LimitReport3.mmObject();
		}

		@Override
		public List<LimitReport3> getValue(Limits3 obj) {
			return obj.getCurrentLimit();
		}

		@Override
		public void setValue(Limits3 obj, List<LimitReport3> value) {
			obj.setCurrentLimit(value);
		}
	};
	@XmlElement(name = "DfltLmt")
	protected List<LimitReport3> defaultLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitReport3
	 * LimitReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Limits3
	 * Limits3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltLmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report is given for a default risk management type limit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Limits3, List<LimitReport3>> mmDefaultLimit = new MMMessageAssociationEnd<Limits3, List<LimitReport3>>() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Limits3.mmObject();
			isDerived = false;
			xmlTag = "DfltLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultLimit";
			definition = "Report is given for a default risk management type limit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LimitReport3.mmObject();
		}

		@Override
		public List<LimitReport3> getValue(Limits3 obj) {
			return obj.getDefaultLimit();
		}

		@Override
		public void setValue(Limits3 obj, List<LimitReport3> value) {
			obj.setDefaultLimit(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Limits3.mmCurrentLimit, com.tools20022.repository.msg.Limits3.mmDefaultLimit);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Limits3";
				definition = "Reports on limits.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<LimitReport3> getCurrentLimit() {
		return currentLimit == null ? currentLimit = new ArrayList<>() : currentLimit;
	}

	public Limits3 setCurrentLimit(List<LimitReport3> currentLimit) {
		this.currentLimit = Objects.requireNonNull(currentLimit);
		return this;
	}

	public List<LimitReport3> getDefaultLimit() {
		return defaultLimit == null ? defaultLimit = new ArrayList<>() : defaultLimit;
	}

	public Limits3 setDefaultLimit(List<LimitReport3> defaultLimit) {
		this.defaultLimit = Objects.requireNonNull(defaultLimit);
		return this;
	}
}