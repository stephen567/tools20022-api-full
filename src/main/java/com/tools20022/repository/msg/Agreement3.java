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
import com.tools20022.repository.codeset.ClosingType1Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DeliveryType2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.SecuritiesFinancingAgreement;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/**
 * Contractual details related to the agreement between parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#Description
 * Agreement3.Description}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#Date
 * Agreement3.Date}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#Currency
 * Agreement3.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#ClosingType
 * Agreement3.ClosingType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#StartDate
 * Agreement3.StartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#DeliveryType
 * Agreement3.DeliveryType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#MarginRatio
 * Agreement3.MarginRatio}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
 * SecuritiesFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Agreement3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to the agreement between parties."
 * </li>
 * </ul>
 */
public class Agreement3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Full name of the base standard agreement, annexes and amendments in place
	 * between the principals and applicable to this deal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#Description
	 * Agreement.Description}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full name of the base standard agreement, annexes and amendments in place between the principals and applicable to this deal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Description = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Agreement3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Description;
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Full name of the base standard agreement, annexes and amendments in place between the principals and applicable to this deal.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Numeric representation of the day of the month and year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#DateSigned
	 * Agreement.DateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numeric representation of the day of the month and year."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Agreement3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.DateSigned;
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Numeric representation of the day of the month and year.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Contractual currency forming the basis of a financing agreement and
	 * associated transactions. Usually, but not always, the same as the trade
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#Currency
	 * SecuritiesFinancingAgreement.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Currency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Agreement3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.Currency;
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Type of financing closing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClosingType1Code
	 * ClosingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#TerminationType
	 * SecuritiesFinancingAgreement.TerminationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of financing closing."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ClosingType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Agreement3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.TerminationType;
			isDerived = false;
			xmlTag = "ClsgTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingType";
			definition = "Type of financing closing.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ClosingType1Code.mmObject();
		}
	};
	/**
	 * Start date of a financing deal that is the date the buyer pays the seller
	 * cash and takes control of the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#FromDateTime
	 * DateTimePeriod.FromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date of a financing deal that is the date the buyer pays the seller cash and takes control of the collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute StartDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Agreement3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.FromDateTime;
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Start date of a financing deal that is the date the buyer pays the seller cash and takes control of the collateral.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies type of settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code
	 * DeliveryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#DeliveryType
	 * SecuritiesFinancingAgreement.DeliveryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies type of settlement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DeliveryType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Agreement3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.DeliveryType;
			isDerived = false;
			xmlTag = "DlvryTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryType";
			definition = "Identifies type of settlement.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DeliveryType2Code.mmObject();
		}
	};
	/**
	 * Fraction of the cash consideration that must be collateralized, expressed
	 * as a percent. A margin ratio of 02% indicates that the value of the
	 * collateral (after deducting for "haircut") must exceed the cash
	 * consideration by 2%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#MarginRatio
	 * SecuritiesFinancingAgreement.MarginRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MarginRatio = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Agreement3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.MarginRatio;
			isDerived = false;
			xmlTag = "MrgnRatio";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginRatio";
			definition = "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Agreement3.Description, com.tools20022.repository.msg.Agreement3.Date, com.tools20022.repository.msg.Agreement3.Currency,
						com.tools20022.repository.msg.Agreement3.ClosingType, com.tools20022.repository.msg.Agreement3.StartDate, com.tools20022.repository.msg.Agreement3.DeliveryType, com.tools20022.repository.msg.Agreement3.MarginRatio);
				trace_lazy = () -> SecuritiesFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<java.util.Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Agreement3";
				definition = "Contractual details related to the agreement between parties.";
			}
		});
		return mmObject_lazy.get();
	}
}