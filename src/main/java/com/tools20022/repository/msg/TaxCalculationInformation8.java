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
import com.tools20022.repository.choice.TaxBasis1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.Tax;
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
 * Information used to calculate the tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#mmBasis
 * TaxCalculationInformation8.mmBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#mmTaxableAmount
 * TaxCalculationInformation8.mmTaxableAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxCalculationInformation8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to calculate the tax."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation9
 * TaxCalculationInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation10
 * TaxCalculationInformation10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation5
 * TaxCalculationInformation5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxCalculationInformation8", propOrder = {"basis", "taxableAmount"})
public class TaxCalculationInformation8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Bsis")
	protected TaxBasis1Choice basis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxBasis1Choice
	 * TaxBasis1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8
	 * TaxCalculationInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of the rebate, for example, cash."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation9#mmBasis
	 * TaxCalculationInformation9.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#mmBasis
	 * TaxCalculationInformation10.mmBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation5#mmBasis
	 * TaxCalculationInformation5.mmBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxCalculationInformation8, Optional<TaxBasis1Choice>> mmBasis = new MMMessageAttribute<TaxCalculationInformation8, Optional<TaxBasis1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculationInformation8.mmObject();
			isDerived = false;
			xmlTag = "Bsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basis";
			definition = "Form of the rebate, for example, cash.";
			nextVersions_lazy = () -> Arrays.asList(TaxCalculationInformation9.mmBasis, TaxCalculationInformation10.mmBasis);
			previousVersion_lazy = () -> TaxCalculationInformation5.mmBasis;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxBasis1Choice.mmObject();
		}

		@Override
		public Optional<TaxBasis1Choice> getValue(TaxCalculationInformation8 obj) {
			return obj.getBasis();
		}

		@Override
		public void setValue(TaxCalculationInformation8 obj, Optional<TaxBasis1Choice> value) {
			obj.setBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblAmt", required = true)
	protected ActiveCurrencyAnd13DecimalAmount taxableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
	 * Tax.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8
	 * TaxCalculationInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money on which the tax is charged."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#mmTaxableAmount
	 * TaxCalculationInformation10.mmTaxableAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxCalculationInformation8, ActiveCurrencyAnd13DecimalAmount> mmTaxableAmount = new MMMessageAttribute<TaxCalculationInformation8, ActiveCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxCalculationInformation8.mmObject();
			isDerived = false;
			xmlTag = "TaxblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableAmount";
			definition = "Amount of money on which the tax is charged.";
			nextVersions_lazy = () -> Arrays.asList(TaxCalculationInformation10.mmTaxableAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAnd13DecimalAmount getValue(TaxCalculationInformation8 obj) {
			return obj.getTaxableAmount();
		}

		@Override
		public void setValue(TaxCalculationInformation8 obj, ActiveCurrencyAnd13DecimalAmount value) {
			obj.setTaxableAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation8.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation8.mmTaxableAmount);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxCalculationInformation8";
				definition = "Information used to calculate the tax.";
				nextVersions_lazy = () -> Arrays.asList(TaxCalculationInformation9.mmObject(), TaxCalculationInformation10.mmObject());
				previousVersion_lazy = () -> TaxCalculationInformation5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TaxBasis1Choice> getBasis() {
		return basis == null ? Optional.empty() : Optional.of(basis);
	}

	public TaxCalculationInformation8 setBasis(TaxBasis1Choice basis) {
		this.basis = basis;
		return this;
	}

	public ActiveCurrencyAnd13DecimalAmount getTaxableAmount() {
		return taxableAmount;
	}

	public TaxCalculationInformation8 setTaxableAmount(ActiveCurrencyAnd13DecimalAmount taxableAmount) {
		this.taxableAmount = Objects.requireNonNull(taxableAmount);
		return this;
	}
}