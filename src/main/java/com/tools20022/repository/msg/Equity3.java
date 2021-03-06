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
import com.tools20022.repository.choice.PreferenceToIncome5Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Equity;
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
 * Financial instrument which represents a title of ownership in a company, ie,
 * the shareholder is entitled to a part of the company's profit - usually by
 * payment of a dividend - and to voting rights, if any. Each company issues
 * generally different classes of shares, eg, ordinary or common shares, which
 * have no guaranteed amount of dividend but carry voting rights, or preferred
 * shares, which receive dividends before ordinary shares but have no voting
 * right.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Equity3#mmPreferenceToIncome
 * Equity3.mmPreferenceToIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity3#mmMaturityDate
 * Equity3.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity3#mmNonPaidAmount
 * Equity3.mmNonPaidAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity3#mmParValue
 * Equity3.mmParValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity3#mmVotingRightsPerShare
 * Equity3.mmVotingRightsPerShare}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Equity3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument which represents a title of ownership in a company, ie, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Equity2 Equity2}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Equity3", propOrder = {"preferenceToIncome", "maturityDate", "nonPaidAmount", "parValue", "votingRightsPerShare"})
public class Equity3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrefToIncm", required = true)
	protected PreferenceToIncome5Choice preferenceToIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome5Choice
	 * PreferenceToIncome5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmPreferenceToIncome
	 * Equity.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity3
	 * Equity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrefToIncm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferenceToIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmPreferenceToIncome
	 * Equity2.mmPreferenceToIncome}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity3, PreferenceToIncome5Choice> mmPreferenceToIncome = new MMMessageAttribute<Equity3, PreferenceToIncome5Choice>() {
		{
			businessElementTrace_lazy = () -> Equity.mmPreferenceToIncome;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity3.mmObject();
			isDerived = false;
			xmlTag = "PrefToIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferenceToIncome";
			definition = "Indicates the level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
			previousVersion_lazy = () -> Equity2.mmPreferenceToIncome;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PreferenceToIncome5Choice.mmObject();
		}

		@Override
		public PreferenceToIncome5Choice getValue(Equity3 obj) {
			return obj.getPreferenceToIncome();
		}

		@Override
		public void setValue(Equity3 obj, PreferenceToIncome5Choice value) {
			obj.setPreferenceToIncome(value);
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODateTime maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity3
	 * Equity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the security will no longer exist, for example, redeemable preference shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmMaturityDate
	 * Equity2.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity3, Optional<ISODateTime>> mmMaturityDate = new MMMessageAttribute<Equity3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity3.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date/time at which the security will no longer exist, for example, redeemable preference shares.";
			previousVersion_lazy = () -> Equity2.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Equity3 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(Equity3 obj, Optional<ISODateTime> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NonPdAmt")
	protected ActiveCurrencyAndAmount nonPaidAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmNonPaidAmount
	 * Equity.mmNonPaidAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity3
	 * Equity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonPdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPaidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal amount which is not paid yet."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmNonPaidAmount
	 * Equity2.mmNonPaidAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity3, Optional<ActiveCurrencyAndAmount>> mmNonPaidAmount = new MMMessageAttribute<Equity3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Equity.mmNonPaidAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity3.mmObject();
			isDerived = false;
			xmlTag = "NonPdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonPaidAmount";
			definition = "Nominal amount which is not paid yet.";
			previousVersion_lazy = () -> Equity2.mmNonPaidAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Equity3 obj) {
			return obj.getNonPaidAmount();
		}

		@Override
		public void setValue(Equity3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNonPaidAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ParVal")
	protected ActiveCurrencyAndAmount parValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmParValue
	 * Equity.mmParValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity3
	 * Equity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value of an equity security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmParValue
	 * Equity2.mmParValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity3, Optional<ActiveCurrencyAndAmount>> mmParValue = new MMMessageAttribute<Equity3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Equity.mmParValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity3.mmObject();
			isDerived = false;
			xmlTag = "ParVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParValue";
			definition = "Nominal value of an equity security.";
			previousVersion_lazy = () -> Equity2.mmParValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Equity3 obj) {
			return obj.getParValue();
		}

		@Override
		public void setValue(Equity3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setParValue(value.orElse(null));
		}
	};
	@XmlElement(name = "VtngRghtsPerShr")
	protected Number votingRightsPerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmVotingRightsPerShare
	 * Equity.mmVotingRightsPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity3
	 * Equity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngRghtsPerShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightsPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of voting rights per share."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmVotingRightsPerShare
	 * Equity2.mmVotingRightsPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity3, Optional<Number>> mmVotingRightsPerShare = new MMMessageAttribute<Equity3, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Equity.mmVotingRightsPerShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity3.mmObject();
			isDerived = false;
			xmlTag = "VtngRghtsPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingRightsPerShare";
			definition = "Number of voting rights per share.";
			previousVersion_lazy = () -> Equity2.mmVotingRightsPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Equity3 obj) {
			return obj.getVotingRightsPerShare();
		}

		@Override
		public void setValue(Equity3 obj, Optional<Number> value) {
			obj.setVotingRightsPerShare(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Equity3.mmPreferenceToIncome, com.tools20022.repository.msg.Equity3.mmMaturityDate, com.tools20022.repository.msg.Equity3.mmNonPaidAmount,
						com.tools20022.repository.msg.Equity3.mmParValue, com.tools20022.repository.msg.Equity3.mmVotingRightsPerShare);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Equity3";
				definition = "Financial instrument which represents a title of ownership in a company, ie, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.";
				previousVersion_lazy = () -> Equity2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PreferenceToIncome5Choice getPreferenceToIncome() {
		return preferenceToIncome;
	}

	public Equity3 setPreferenceToIncome(PreferenceToIncome5Choice preferenceToIncome) {
		this.preferenceToIncome = Objects.requireNonNull(preferenceToIncome);
		return this;
	}

	public Optional<ISODateTime> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public Equity3 setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNonPaidAmount() {
		return nonPaidAmount == null ? Optional.empty() : Optional.of(nonPaidAmount);
	}

	public Equity3 setNonPaidAmount(ActiveCurrencyAndAmount nonPaidAmount) {
		this.nonPaidAmount = nonPaidAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getParValue() {
		return parValue == null ? Optional.empty() : Optional.of(parValue);
	}

	public Equity3 setParValue(ActiveCurrencyAndAmount parValue) {
		this.parValue = parValue;
		return this;
	}

	public Optional<Number> getVotingRightsPerShare() {
		return votingRightsPerShare == null ? Optional.empty() : Optional.of(votingRightsPerShare);
	}

	public Equity3 setVotingRightsPerShare(Number votingRightsPerShare) {
		this.votingRightsPerShare = votingRightsPerShare;
		return this;
	}
}