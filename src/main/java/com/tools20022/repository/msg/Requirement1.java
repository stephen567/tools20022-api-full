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
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.MarginAmountRequirement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarginRequirement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the margin requirements for the variation margin and
 * optionally the segregated independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Requirement1#mmVariationMarginRequirement
 * Requirement1.mmVariationMarginRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Requirement1#mmSegregatedIndependentAmountRequirement
 * Requirement1.mmSegregatedIndependentAmountRequirement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
 * MarginAmountRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Requirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the margin requirements for the variation margin and optionally the segregated independent amount."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Requirement1", propOrder = {"variationMarginRequirement", "segregatedIndependentAmountRequirement"})
public class Requirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VartnMrgnRqrmnt", required = true)
	protected MarginRequirement1 variationMarginRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginRequirement1
	 * MarginRequirement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
	 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Requirement1 Requirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnRqrmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin requirements for the variation margin."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Requirement1, MarginRequirement1> mmVariationMarginRequirement = new MMMessageAssociationEnd<Requirement1, MarginRequirement1>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmVariationMarginAmountRequirement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Requirement1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRequirement";
			definition = "Provides details about the margin requirements for the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginRequirement1.mmObject();
		}

		@Override
		public MarginRequirement1 getValue(Requirement1 obj) {
			return obj.getVariationMarginRequirement();
		}

		@Override
		public void setValue(Requirement1 obj, MarginRequirement1 value) {
			obj.setVariationMarginRequirement(value);
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmtRqrmnt")
	protected MarginRequirement1 segregatedIndependentAmountRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginRequirement1
	 * MarginRequirement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmSegregatedAmountRequirement
	 * ExposureCalculation.mmSegregatedAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Requirement1 Requirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmtRqrmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin requirements for the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Requirement1, Optional<MarginRequirement1>> mmSegregatedIndependentAmountRequirement = new MMMessageAssociationEnd<Requirement1, Optional<MarginRequirement1>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmSegregatedAmountRequirement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Requirement1.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmtRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRequirement";
			definition = "Provides details about the margin requirements for the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginRequirement1.mmObject();
		}

		@Override
		public Optional<MarginRequirement1> getValue(Requirement1 obj) {
			return obj.getSegregatedIndependentAmountRequirement();
		}

		@Override
		public void setValue(Requirement1 obj, Optional<MarginRequirement1> value) {
			obj.setSegregatedIndependentAmountRequirement(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Requirement1.mmVariationMarginRequirement, com.tools20022.repository.msg.Requirement1.mmSegregatedIndependentAmountRequirement);
				trace_lazy = () -> MarginAmountRequirement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Requirement1";
				definition = "Provides details about the margin requirements for the variation margin and optionally the segregated independent amount.";
			}
		});
		return mmObject_lazy.get();
	}

	public MarginRequirement1 getVariationMarginRequirement() {
		return variationMarginRequirement;
	}

	public Requirement1 setVariationMarginRequirement(MarginRequirement1 variationMarginRequirement) {
		this.variationMarginRequirement = Objects.requireNonNull(variationMarginRequirement);
		return this;
	}

	public Optional<MarginRequirement1> getSegregatedIndependentAmountRequirement() {
		return segregatedIndependentAmountRequirement == null ? Optional.empty() : Optional.of(segregatedIndependentAmountRequirement);
	}

	public Requirement1 setSegregatedIndependentAmountRequirement(MarginRequirement1 segregatedIndependentAmountRequirement) {
		this.segregatedIndependentAmountRequirement = segregatedIndependentAmountRequirement;
		return this;
	}
}