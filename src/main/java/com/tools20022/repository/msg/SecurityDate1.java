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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.DateFormat6Choice;
import com.tools20022.repository.entity.*;
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
 * Specifies security date details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate1#mmPostingDate
 * SecurityDate1.mmPostingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate1#mmAvailableDate
 * SecurityDate1.mmAvailableDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate1#mmPariPassuDate
 * SecurityDate1.mmPariPassuDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmDividendRankingDate
 * SecurityDate1.mmDividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmEarliestPaymentDate
 * SecurityDate1.mmEarliestPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityDate1#mmPaymentDate
 * SecurityDate1.mmPaymentDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "SecurityDate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies security date details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityDate1", propOrder = {"postingDate", "availableDate", "pariPassuDate", "dividendRankingDate", "earliestPaymentDate", "paymentDate"})
public class SecurityDate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PstngDt", required = true)
	protected DateAndDateTimeChoice postingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingDateTime
	 * CorporateActionDistribution.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1 SecurityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::POST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the posting (credit or debit) to the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate1.mmObject();
			isDerived = false;
			xmlTag = "PstngDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::POST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDate";
			definition = "Date of the posting (credit or debit) to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "AvlblDt")
	protected DateFormat6Choice availableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
	 * Security.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1 SecurityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::AVAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which securities become available for trading, for example first dealing date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmAvailableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate1.mmObject();
			isDerived = false;
			xmlTag = "AvlblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::AVAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDate";
			definition = "Date/time at which securities become available for trading, for example first dealing date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "PrpssDt")
	protected DateFormat6Choice pariPassuDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmPariPassuDate
	 * CorporateActionEvent.mmPariPassuDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1 SecurityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrpssDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PPDT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassuDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which security will assimilate, become fungible, or have the same rights to dividends as the parent issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPariPassuDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmPariPassuDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate1.mmObject();
			isDerived = false;
			xmlTag = "PrpssDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PPDT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassuDate";
			definition = "Date/time at which security will assimilate, become fungible, or have the same rights to dividends as the parent issue.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "DvddRnkgDt")
	protected DateFormat6Choice dividendRankingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendRankingDate
	 * Dividend.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1 SecurityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddRnkgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::DIVR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRankingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a security will be entitled to a dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDividendRankingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDividendRankingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate1.mmObject();
			isDerived = false;
			xmlTag = "DvddRnkgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::DIVR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendRankingDate";
			definition = "Date/time at which a security will be entitled to a dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "EarlstPmtDt")
	protected DateFormat6Choice earliestPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
	 * ProceedsDefinition.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1 SecurityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EARL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmEarliestPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EARL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which a payment can be made, for example, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};
	@XmlElement(name = "PmtDt")
	protected DateFormat6Choice paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat6Choice
	 * DateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1 SecurityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PAYD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityDate1.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PAYD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat6Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.mmPostingDate, com.tools20022.repository.msg.SecurityDate1.mmAvailableDate, com.tools20022.repository.msg.SecurityDate1.mmPariPassuDate,
						com.tools20022.repository.msg.SecurityDate1.mmDividendRankingDate, com.tools20022.repository.msg.SecurityDate1.mmEarliestPaymentDate, com.tools20022.repository.msg.SecurityDate1.mmPaymentDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityDate1";
				definition = "Specifies security date details.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTimeChoice getPostingDate() {
		return postingDate;
	}

	public SecurityDate1 setPostingDate(DateAndDateTimeChoice postingDate) {
		this.postingDate = Objects.requireNonNull(postingDate);
		return this;
	}

	public Optional<DateFormat6Choice> getAvailableDate() {
		return availableDate == null ? Optional.empty() : Optional.of(availableDate);
	}

	public SecurityDate1 setAvailableDate(DateFormat6Choice availableDate) {
		this.availableDate = availableDate;
		return this;
	}

	public Optional<DateFormat6Choice> getPariPassuDate() {
		return pariPassuDate == null ? Optional.empty() : Optional.of(pariPassuDate);
	}

	public SecurityDate1 setPariPassuDate(DateFormat6Choice pariPassuDate) {
		this.pariPassuDate = pariPassuDate;
		return this;
	}

	public Optional<DateFormat6Choice> getDividendRankingDate() {
		return dividendRankingDate == null ? Optional.empty() : Optional.of(dividendRankingDate);
	}

	public SecurityDate1 setDividendRankingDate(DateFormat6Choice dividendRankingDate) {
		this.dividendRankingDate = dividendRankingDate;
		return this;
	}

	public Optional<DateFormat6Choice> getEarliestPaymentDate() {
		return earliestPaymentDate == null ? Optional.empty() : Optional.of(earliestPaymentDate);
	}

	public SecurityDate1 setEarliestPaymentDate(DateFormat6Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
		return this;
	}

	public Optional<DateFormat6Choice> getPaymentDate() {
		return paymentDate == null ? Optional.empty() : Optional.of(paymentDate);
	}

	public SecurityDate1 setPaymentDate(DateFormat6Choice paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}
}