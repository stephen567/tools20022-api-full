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
import com.tools20022.repository.codeset.TerminalManagementAction4Code;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DataSetIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of an individual terminal management action by the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification5#mmActionType
 * TMSActionIdentification5.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification5#mmDataSetIdentification
 * TMSActionIdentification5.mmDataSetIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TMSActionIdentification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of an individual terminal management action by the point of interaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4
 * TMSActionIdentification4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TMSActionIdentification5", propOrder = {"actionType", "dataSetIdentification"})
public class TMSActionIdentification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction4Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
	 * TerminalManagementAction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification5
	 * TMSActionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of terminal management action performed by a point of interaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4#mmActionType
	 * TMSActionIdentification4.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSActionIdentification5, TerminalManagementAction4Code> mmActionType = new MMMessageAttribute<TMSActionIdentification5, TerminalManagementAction4Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSActionIdentification5.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Types of terminal management action performed by a point of interaction.";
			previousVersion_lazy = () -> TMSActionIdentification4.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction4Code.mmObject();
		}

		@Override
		public TerminalManagementAction4Code getValue(TMSActionIdentification5 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(TMSActionIdentification5 obj, TerminalManagementAction4Code value) {
			obj.setActionType(value);
		}
	};
	@XmlElement(name = "DataSetId")
	protected DataSetIdentification7 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification7
	 * DataSetIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification5
	 * TMSActionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set on which the action has been performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4#mmDataSetIdentification
	 * TMSActionIdentification4.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSActionIdentification5, Optional<DataSetIdentification7>> mmDataSetIdentification = new MMMessageAssociationEnd<TMSActionIdentification5, Optional<DataSetIdentification7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSActionIdentification5.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set on which the action has been performed.";
			previousVersion_lazy = () -> TMSActionIdentification4.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DataSetIdentification7.mmObject();
		}

		@Override
		public Optional<DataSetIdentification7> getValue(TMSActionIdentification5 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(TMSActionIdentification5 obj, Optional<DataSetIdentification7> value) {
			obj.setDataSetIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSActionIdentification5.mmActionType, com.tools20022.repository.msg.TMSActionIdentification5.mmDataSetIdentification);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSActionIdentification5";
				definition = "Result of an individual terminal management action by the point of interaction.";
				previousVersion_lazy = () -> TMSActionIdentification4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction4Code getActionType() {
		return actionType;
	}

	public TMSActionIdentification5 setActionType(TerminalManagementAction4Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Optional<DataSetIdentification7> getDataSetIdentification() {
		return dataSetIdentification == null ? Optional.empty() : Optional.of(dataSetIdentification);
	}

	public TMSActionIdentification5 setDataSetIdentification(DataSetIdentification7 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
		return this;
	}
}