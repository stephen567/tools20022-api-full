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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MemberReturnCriteria;
import com.tools20022.repository.msg.MemberSearchCriteria;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a member and to report on the member.
 * A name may be given to the new query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MemberCriteria#mmNewQueryName
 * MemberCriteria.mmNewQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberCriteria#mmSearchCriteria
 * MemberCriteria.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberCriteria#mmReturnCriteria
 * MemberCriteria.mmReturnCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemberCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria used to search for a member and to report on the member. A name may be given to the new query."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule#forMemberCriteria
 * ConstraintReturnCriteriaAndOrSearchCriteriaRule.forMemberCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MemberCriteria3
 * MemberCriteria3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MemberCriteria", propOrder = {"newQueryName", "searchCriteria", "returnCriteria"})
public class MemberCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NewQryNm")
	protected Max35Text newQueryName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria MemberCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewQryNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewQueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the query defined by the search criteria and return criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria3#mmNewQueryName
	 * MemberCriteria3.mmNewQueryName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberCriteria, Optional<Max35Text>> mmNewQueryName = new MMMessageAttribute<MemberCriteria, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberCriteria.mmObject();
			isDerived = false;
			xmlTag = "NewQryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewQueryName";
			definition = "Name of the query defined by the search criteria and return criteria.";
			nextVersions_lazy = () -> Arrays.asList(MemberCriteria3.mmNewQueryName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MemberCriteria obj) {
			return obj.getNewQueryName();
		}

		@Override
		public void setValue(MemberCriteria obj, Optional<Max35Text> value) {
			obj.setNewQueryName(value.orElse(null));
		}
	};
	@XmlElement(name = "SchCrit")
	protected List<MemberSearchCriteria> searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MemberSearchCriteria
	 * MemberSearchCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria MemberCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria based on which the information is extracted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria3#mmSearchCriteria
	 * MemberCriteria3.mmSearchCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MemberCriteria, List<MemberSearchCriteria>> mmSearchCriteria = new MMMessageAssociationEnd<MemberCriteria, List<MemberSearchCriteria>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberCriteria.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria based on which the information is extracted.";
			nextVersions_lazy = () -> Arrays.asList(MemberCriteria3.mmSearchCriteria);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MemberSearchCriteria.mmObject();
		}

		@Override
		public List<MemberSearchCriteria> getValue(MemberCriteria obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(MemberCriteria obj, List<MemberSearchCriteria> value) {
			obj.setSearchCriteria(value);
		}
	};
	@XmlElement(name = "RtrCrit")
	protected MemberReturnCriteria returnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria MemberCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the expected report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberCriteria3#mmReturnCriteria
	 * MemberCriteria3.mmReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MemberCriteria, Optional<MemberReturnCriteria>> mmReturnCriteria = new MMMessageAssociationEnd<MemberCriteria, Optional<MemberReturnCriteria>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberCriteria.mmObject();
			isDerived = false;
			xmlTag = "RtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteria";
			definition = "Defines the expected report.";
			nextVersions_lazy = () -> Arrays.asList(MemberCriteria3.mmReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MemberReturnCriteria.mmObject();
		}

		@Override
		public Optional<MemberReturnCriteria> getValue(MemberCriteria obj) {
			return obj.getReturnCriteria();
		}

		@Override
		public void setValue(MemberCriteria obj, Optional<MemberReturnCriteria> value) {
			obj.setReturnCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberCriteria.mmNewQueryName, com.tools20022.repository.msg.MemberCriteria.mmSearchCriteria,
						com.tools20022.repository.msg.MemberCriteria.mmReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReturnCriteriaAndOrSearchCriteriaRule.forMemberCriteria);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MemberCriteria";
				definition = "Defines the criteria used to search for a member and to report on the member. A name may be given to the new query.";
				nextVersions_lazy = () -> Arrays.asList(MemberCriteria3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNewQueryName() {
		return newQueryName == null ? Optional.empty() : Optional.of(newQueryName);
	}

	public MemberCriteria setNewQueryName(Max35Text newQueryName) {
		this.newQueryName = newQueryName;
		return this;
	}

	public List<MemberSearchCriteria> getSearchCriteria() {
		return searchCriteria == null ? searchCriteria = new ArrayList<>() : searchCriteria;
	}

	public MemberCriteria setSearchCriteria(List<MemberSearchCriteria> searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}

	public Optional<MemberReturnCriteria> getReturnCriteria() {
		return returnCriteria == null ? Optional.empty() : Optional.of(returnCriteria);
	}

	public MemberCriteria setReturnCriteria(MemberReturnCriteria returnCriteria) {
		this.returnCriteria = returnCriteria;
		return this;
	}
}