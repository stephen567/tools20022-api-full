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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmAccountIdentification
 * CollateralValueSearchCriteria1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmCurrency
 * CollateralValueSearchCriteria1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmAccountOwner
 * CollateralValueSearchCriteria1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmAccountServicer
 * CollateralValueSearchCriteria1.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmFinancialInstrumentIdentification
 * CollateralValueSearchCriteria1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmSecuritiesAccountOwner
 * CollateralValueSearchCriteria1.mmSecuritiesAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1#mmSecuritiesAccountServicer
 * CollateralValueSearchCriteria1.mmSecuritiesAccountServicer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline#forCollateralValueSearchCriteria1
 * ConstraintCashAccountIdentificationGuideline.
 * forCollateralValueSearchCriteria1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValueSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for an account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValueSearchCriteria1", propOrder = {"accountIdentification", "currency", "accountOwner", "accountServicer", "financialInstrumentIdentification", "securitiesAccountOwner", "securitiesAccountServicer"})
public class CollateralValueSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected AccountIdentification4Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	@XmlElement(name = "Ccy")
	protected List<ActiveOrHistoricCurrencyCode> currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
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
	 * definition} = "Medium of exchange of value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification71Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account being queried."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification71Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, which is being queried."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected List<com.tools20022.repository.msg.SecurityIdentification14> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISIN identification of the related financial instrument into which this security can be converted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "ISIN identification of the related financial instrument into which this security can be converted.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	@XmlElement(name = "SctiesAcctOwnr")
	protected PartyIdentification71Choice securitiesAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the securities account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesAccountOwner = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountOwner";
			definition = "Unique and unambiguous identification of the securities account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesAcctSvcr")
	protected PartyIdentification71Choice securitiesAccountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria1
	 * CollateralValueSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the securities account on behalf of the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesAccountServicer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountServicer";
			definition = "Party that manages the securities account on behalf of the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmAccountIdentification, com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmCurrency,
						com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmAccountOwner, com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmAccountServicer,
						com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmSecuritiesAccountOwner,
						com.tools20022.repository.msg.CollateralValueSearchCriteria1.mmSecuritiesAccountServicer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCashAccountIdentificationGuideline.forCollateralValueSearchCriteria1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueSearchCriteria1";
				definition = "Defines the criteria used to search for an account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountIdentification4Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public CollateralValueSearchCriteria1 setAccountIdentification(AccountIdentification4Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? currency = new ArrayList<>() : currency;
	}

	public CollateralValueSearchCriteria1 setCurrency(List<ActiveOrHistoricCurrencyCode> currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<PartyIdentification71Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CollateralValueSearchCriteria1 setAccountOwner(PartyIdentification71Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<PartyIdentification71Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CollateralValueSearchCriteria1 setAccountServicer(PartyIdentification71Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public List<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public CollateralValueSearchCriteria1 setFinancialInstrumentIdentification(List<com.tools20022.repository.msg.SecurityIdentification14> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<PartyIdentification71Choice> getSecuritiesAccountOwner() {
		return securitiesAccountOwner == null ? Optional.empty() : Optional.of(securitiesAccountOwner);
	}

	public CollateralValueSearchCriteria1 setSecuritiesAccountOwner(PartyIdentification71Choice securitiesAccountOwner) {
		this.securitiesAccountOwner = securitiesAccountOwner;
		return this;
	}

	public Optional<PartyIdentification71Choice> getSecuritiesAccountServicer() {
		return securitiesAccountServicer == null ? Optional.empty() : Optional.of(securitiesAccountServicer);
	}

	public CollateralValueSearchCriteria1 setSecuritiesAccountServicer(PartyIdentification71Choice securitiesAccountServicer) {
		this.securitiesAccountServicer = securitiesAccountServicer;
		return this;
	}
}