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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Quantity2Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the quantity of security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmUnit
 * FinancialInstrumentQuantity2Choice.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmFaceAmount
 * FinancialInstrumentQuantity2Choice.mmFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmAmortisedValue
 * FinancialInstrumentQuantity2Choice.mmAmortisedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmCode
 * FinancialInstrumentQuantity2Choice.mmCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentQuantity2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the quantity of security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentQuantity2Choice", propOrder = {"unit", "faceAmount", "amortisedValue", "code"})
public class FinancialInstrumentQuantity2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Unit", required = true)
	protected DecimalNumber unit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice
	 * FinancialInstrumentQuantity2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Unit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a number, for example, a number of shares."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: UNIT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantity2Choice, DecimalNumber> mmUnit = new MMMessageAttribute<FinancialInstrumentQuantity2Choice, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Unit";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "UNIT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Quantity expressed as a number, for example, a number of shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(FinancialInstrumentQuantity2Choice obj) {
			return obj.getUnit();
		}

		@Override
		public void setValue(FinancialInstrumentQuantity2Choice obj, DecimalNumber value) {
			obj.setUnit(value);
		}
	};
	@XmlElement(name = "FaceAmt", required = true)
	protected ImpliedCurrencyAndAmount faceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice
	 * FinancialInstrumentQuantity2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaceAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the face amount, that is, the principal, of a debt instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::4!c//FAMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantity2Choice, ImpliedCurrencyAndAmount> mmFaceAmount = new MMMessageAttribute<FinancialInstrumentQuantity2Choice, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmObject();
			isDerived = false;
			xmlTag = "FaceAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::4!c//FAMT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, that is, the principal, of a debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(FinancialInstrumentQuantity2Choice obj) {
			return obj.getFaceAmount();
		}

		@Override
		public void setValue(FinancialInstrumentQuantity2Choice obj, ImpliedCurrencyAndAmount value) {
			obj.setFaceAmount(value);
		}
	};
	@XmlElement(name = "AmtsdVal", required = true)
	protected ImpliedCurrencyAndAmount amortisedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
	 * AssetHolding.mmAmortisedFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice
	 * FinancialInstrumentQuantity2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsdVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::4!c//AMOR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantity2Choice, ImpliedCurrencyAndAmount> mmAmortisedValue = new MMMessageAttribute<FinancialInstrumentQuantity2Choice, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAmortisedFaceValue;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtsdVal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::4!c//AMOR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisedValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(FinancialInstrumentQuantity2Choice obj) {
			return obj.getAmortisedValue();
		}

		@Override
		public void setValue(FinancialInstrumentQuantity2Choice obj, ImpliedCurrencyAndAmount value) {
			obj.setAmortisedValue(value);
		}
	};
	@XmlElement(name = "Cd", required = true)
	protected Quantity2Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Quantity2Code
	 * Quantity2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCode
	 * SecuritiesQuantity.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice
	 * FinancialInstrumentQuantity2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::4!c//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantity2Choice, Quantity2Code> mmCode = new MMMessageAttribute<FinancialInstrumentQuantity2Choice, Quantity2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::4!c//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Quantity expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Quantity2Code.mmObject();
		}

		@Override
		public Quantity2Code getValue(FinancialInstrumentQuantity2Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(FinancialInstrumentQuantity2Choice obj, Quantity2Code value) {
			obj.setCode(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmUnit, com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmFaceAmount,
						com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmAmortisedValue, com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.mmCode);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentQuantity2Choice";
				definition = "Choice between formats for the quantity of security.";
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getUnit() {
		return unit;
	}

	public FinancialInstrumentQuantity2Choice setUnit(DecimalNumber unit) {
		this.unit = Objects.requireNonNull(unit);
		return this;
	}

	public ImpliedCurrencyAndAmount getFaceAmount() {
		return faceAmount;
	}

	public FinancialInstrumentQuantity2Choice setFaceAmount(ImpliedCurrencyAndAmount faceAmount) {
		this.faceAmount = Objects.requireNonNull(faceAmount);
		return this;
	}

	public ImpliedCurrencyAndAmount getAmortisedValue() {
		return amortisedValue;
	}

	public FinancialInstrumentQuantity2Choice setAmortisedValue(ImpliedCurrencyAndAmount amortisedValue) {
		this.amortisedValue = Objects.requireNonNull(amortisedValue);
		return this;
	}

	public Quantity2Code getCode() {
		return code;
	}

	public FinancialInstrumentQuantity2Choice setCode(Quantity2Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}
}