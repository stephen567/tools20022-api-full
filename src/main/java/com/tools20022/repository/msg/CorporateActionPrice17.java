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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PriceFormat19Choice;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies prices of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17#mmMaximumPrice
 * CorporateActionPrice17.mmMaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17#mmMinimumPrice
 * CorporateActionPrice17.mmMinimumPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices of a corporate action."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice42
 * CorporateActionPrice42}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice17", propOrder = {"maximumPrice", "minimumPrice"})
public class CorporateActionPrice17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MaxPric")
	protected PriceFormat19Choice maximumPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat19Choice
	 * PriceFormat19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
	 * BiddingConditions.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17
	 * CorporateActionPrice17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum or cap price at which a holder can bid, for example, on a Dutch auction offer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::MAXP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice42#mmMaximumPrice
	 * CorporateActionPrice42.mmMaximumPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice17, Optional<PriceFormat19Choice>> mmMaximumPrice = new MMMessageAssociationEnd<CorporateActionPrice17, Optional<PriceFormat19Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice17.mmObject();
			isDerived = false;
			xmlTag = "MaxPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::MAXP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumPrice";
			definition = "Maximum or cap price at which a holder can bid, for example, on a Dutch auction offer.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice42.mmMaximumPrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat19Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat19Choice> getValue(CorporateActionPrice17 obj) {
			return obj.getMaximumPrice();
		}

		@Override
		public void setValue(CorporateActionPrice17 obj, Optional<PriceFormat19Choice> value) {
			obj.setMaximumPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "MinPric")
	protected PriceFormat19Choice minimumPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat19Choice
	 * PriceFormat19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
	 * BiddingConditions.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17
	 * CorporateActionPrice17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum or floor price at which a holder can bid, for example, on a Dutch auction offer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::MINP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice42#mmMinimumPrice
	 * CorporateActionPrice42.mmMinimumPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice17, Optional<PriceFormat19Choice>> mmMinimumPrice = new MMMessageAssociationEnd<CorporateActionPrice17, Optional<PriceFormat19Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMinimumPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice17.mmObject();
			isDerived = false;
			xmlTag = "MinPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::MINP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumPrice";
			definition = "Minimum or floor price at which a holder can bid, for example, on a Dutch auction offer.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice42.mmMinimumPrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat19Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat19Choice> getValue(CorporateActionPrice17 obj) {
			return obj.getMinimumPrice();
		}

		@Override
		public void setValue(CorporateActionPrice17 obj, Optional<PriceFormat19Choice> value) {
			obj.setMinimumPrice(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice17.mmMaximumPrice, com.tools20022.repository.msg.CorporateActionPrice17.mmMinimumPrice);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice17";
				definition = "Specifies prices of a corporate action.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionPrice42.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceFormat19Choice> getMaximumPrice() {
		return maximumPrice == null ? Optional.empty() : Optional.of(maximumPrice);
	}

	public CorporateActionPrice17 setMaximumPrice(PriceFormat19Choice maximumPrice) {
		this.maximumPrice = maximumPrice;
		return this;
	}

	public Optional<PriceFormat19Choice> getMinimumPrice() {
		return minimumPrice == null ? Optional.empty() : Optional.of(minimumPrice);
	}

	public CorporateActionPrice17 setMinimumPrice(PriceFormat19Choice minimumPrice) {
		this.minimumPrice = minimumPrice;
		return this;
	}
}