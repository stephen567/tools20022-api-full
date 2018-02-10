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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DiscountAmountType1Choice;
import com.tools20022.repository.choice.DiscountOrChargeType1Choice;
import com.tools20022.repository.choice.DiscountTypeFormat1Choice;
import com.tools20022.repository.choice.ReferredDocumentAmount1Choice;
import com.tools20022.repository.codeset.DiscountTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Decrease of the value of goods and / or services by applying a discount rate
 * to the original amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Discount" src="doc-files/Discount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountAppliedAmount
 * Discount.mmDiscountAppliedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discount#mmDiscountType
 * Discount.mmDiscountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountBasisAmount
 * Discount.mmDiscountBasisAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DiscountAmountAndType1#mmType
 * DiscountAmountAndType1.mmType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DiscountAmountType1Choice
 * DiscountAmountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DiscountAmountAndType1
 * DiscountAmountAndType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DiscountTypeFormat1Choice
 * DiscountTypeFormat1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Discount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decrease of the value of goods and / or services by applying a discount rate to the original amount."
 * </li>
 * </ul>
 */
public class Discount extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount discountAppliedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmDiscountAppliedAmount
	 * ReferredDocumentAmount1Choice.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmDiscountAppliedAmount
	 * RemittanceAmount1.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDiscountAppliedAmount
	 * RemittanceAmount2.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTotalDiscountAmount
	 * SettlementMonetarySummation1.mmTotalDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDiscountAppliedAmount
	 * RemittanceAmount3.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDiscountAmount
	 * PaymentTerms6.mmDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDiscountAmount
	 * EarlyPayment1.mmDiscountAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountAppliedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDiscountAppliedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentAmount1Choice.mmDiscountAppliedAmount, RemittanceAmount1.mmDiscountAppliedAmount, RemittanceAmount2.mmDiscountAppliedAmount,
					SettlementMonetarySummation1.mmTotalDiscountAmount, RemittanceAmount3.mmDiscountAppliedAmount, PaymentTerms6.mmDiscountAmount, EarlyPayment1.mmDiscountAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Discount.class.getMethod("getDiscountAppliedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DiscountTypeCode discountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountAmountType1Choice#mmCode
	 * DiscountAmountType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountTypeFormat1Choice#mmCode
	 * DiscountTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountTypeFormat1Choice#mmProprietary
	 * DiscountTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice#mmDiscountType
	 * DiscountOrChargeType1Choice.mmDiscountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of discount applied to the original amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDiscountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DiscountAmountType1Choice.mmCode, DiscountTypeFormat1Choice.mmCode, DiscountTypeFormat1Choice.mmProprietary, DiscountOrChargeType1Choice.mmDiscountType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountType";
			definition = "Specifies the type of discount applied to the original amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DiscountTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Discount.class.getMethod("getDiscountType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount discountBasisAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountBasisAmount
	 * PaymentTerms3.mmDiscountBasisAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmBasisAmount
	 * PaymentTerms6.mmBasisAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountBasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount used as a basis to calculate the discount amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDiscountBasisAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTerms3.mmDiscountBasisAmount, PaymentTerms6.mmBasisAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountBasisAmount";
			definition = "Amount used as a basis to calculate the discount amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Discount.class.getMethod("getDiscountBasisAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Discount";
				definition = "Decrease of the value of goods and / or services by applying a discount rate to the original amount.";
				derivationElement_lazy = () -> Arrays.asList(DiscountAmountAndType1.mmType);
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.Discount.mmDiscountAppliedAmount, com.tools20022.repository.entity.Discount.mmDiscountType, com.tools20022.repository.entity.Discount.mmDiscountBasisAmount);
				derivationComponent_lazy = () -> Arrays.asList(DiscountAmountType1Choice.mmObject(), DiscountAmountAndType1.mmObject(), DiscountTypeFormat1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Discount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getDiscountAppliedAmount() {
		return discountAppliedAmount;
	}

	public Discount setDiscountAppliedAmount(CurrencyAndAmount discountAppliedAmount) {
		this.discountAppliedAmount = Objects.requireNonNull(discountAppliedAmount);
		return this;
	}

	public DiscountTypeCode getDiscountType() {
		return discountType;
	}

	public Discount setDiscountType(DiscountTypeCode discountType) {
		this.discountType = Objects.requireNonNull(discountType);
		return this;
	}

	public CurrencyAndAmount getDiscountBasisAmount() {
		return discountBasisAmount;
	}

	public Discount setDiscountBasisAmount(CurrencyAndAmount discountBasisAmount) {
		this.discountBasisAmount = Objects.requireNonNull(discountBasisAmount);
		return this;
	}
}