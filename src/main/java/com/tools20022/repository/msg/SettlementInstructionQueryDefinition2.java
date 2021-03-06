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
import com.tools20022.repository.codeset.SettlementQueryType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementInstructionQueryCriteria2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the information that is searched through the definition of specific
 * criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryDefinition2#mmQueryType
 * SettlementInstructionQueryDefinition2.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryDefinition2#mmSearchCriteria
 * SettlementInstructionQueryDefinition2.mmSearchCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionQueryDefinition2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the information that is searched through the definition of specific criteria."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryDefinition1
 * SettlementInstructionQueryDefinition1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInstructionQueryDefinition2", propOrder = {"queryType", "searchCriteria"})
public class SettlementInstructionQueryDefinition2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryTp", required = true)
	protected SettlementQueryType1Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementQueryType1Code
	 * SettlementQueryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryDefinition2
	 * SettlementInstructionQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of query."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryDefinition1#mmQueryType
	 * SettlementInstructionQueryDefinition1.mmQueryType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryDefinition2, SettlementQueryType1Code> mmQueryType = new MMMessageAttribute<SettlementInstructionQueryDefinition2, SettlementQueryType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Defines the type of query.";
			previousVersion_lazy = () -> SettlementInstructionQueryDefinition1.mmQueryType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementQueryType1Code.mmObject();
		}

		@Override
		public SettlementQueryType1Code getValue(SettlementInstructionQueryDefinition2 obj) {
			return obj.getQueryType();
		}

		@Override
		public void setValue(SettlementInstructionQueryDefinition2 obj, SettlementQueryType1Code value) {
			obj.setQueryType(value);
		}
	};
	@XmlElement(name = "SchCrit", required = true)
	protected SettlementInstructionQueryCriteria2 searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryCriteria2
	 * SettlementInstructionQueryCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryDefinition2
	 * SettlementInstructionQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria to extract the securities settlement instruction information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInstructionQueryDefinition1#mmSearchCriteria
	 * SettlementInstructionQueryDefinition1.mmSearchCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInstructionQueryDefinition2, SettlementInstructionQueryCriteria2> mmSearchCriteria = new MMMessageAttribute<SettlementInstructionQueryDefinition2, SettlementInstructionQueryCriteria2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInstructionQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria to extract the securities settlement instruction information.";
			previousVersion_lazy = () -> SettlementInstructionQueryDefinition1.mmSearchCriteria;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementInstructionQueryCriteria2.mmObject();
		}

		@Override
		public SettlementInstructionQueryCriteria2 getValue(SettlementInstructionQueryDefinition2 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(SettlementInstructionQueryDefinition2 obj, SettlementInstructionQueryCriteria2 value) {
			obj.setSearchCriteria(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstructionQueryDefinition2.mmQueryType, com.tools20022.repository.msg.SettlementInstructionQueryDefinition2.mmSearchCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInstructionQueryDefinition2";
				definition = "Defines the information that is searched through the definition of specific criteria.";
				previousVersion_lazy = () -> SettlementInstructionQueryDefinition1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementQueryType1Code getQueryType() {
		return queryType;
	}

	public SettlementInstructionQueryDefinition2 setQueryType(SettlementQueryType1Code queryType) {
		this.queryType = Objects.requireNonNull(queryType);
		return this;
	}

	public SettlementInstructionQueryCriteria2 getSearchCriteria() {
		return searchCriteria;
	}

	public SettlementInstructionQueryDefinition2 setSearchCriteria(SettlementInstructionQueryCriteria2 searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}
}