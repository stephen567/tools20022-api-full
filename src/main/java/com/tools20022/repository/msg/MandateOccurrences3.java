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
import com.tools20022.repository.choice.Frequency21Choice;
import com.tools20022.repository.codeset.SequenceType2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details related to the duration of the mandate and the
 * occurrence of the underlying transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#SequenceType
 * MandateOccurrences3.SequenceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences3#Frequency
 * MandateOccurrences3.Frequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences3#Duration
 * MandateOccurrences3.Duration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#FirstCollectionDate
 * MandateOccurrences3.FirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#FinalCollectionDate
 * MandateOccurrences3.FinalCollectionDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
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
 * "MandateOccurrences3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details related to the duration of the mandate and the occurrence of the underlying transactions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences4
 * MandateOccurrences4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2
 * MandateOccurrences2}</li>
 * </ul>
 */
public class MandateOccurrences3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the underlying transaction sequence as either recurring or
	 * one-off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType2Code
	 * SequenceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#SequenceType
	 * PaymentProcessing.SequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the underlying transaction sequence as either recurring or one-off."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#SequenceType
	 * MandateOccurrences4.SequenceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#SequenceType
	 * MandateOccurrences2.SequenceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SequenceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateOccurrences3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.SequenceType;
			isDerived = false;
			xmlTag = "SeqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceType";
			definition = "Identifies the underlying transaction sequence as either recurring or one-off.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateOccurrences2.SequenceType;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.SequenceType);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SequenceType2Code.mmObject();
		}
	};
	/**
	 * Regularity with which instructions are to be created and processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency21Choice
	 * Frequency21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#Frequency
	 * DirectDebitMandate.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which instructions are to be created and processed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#Frequency
	 * MandateOccurrences4.Frequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#Frequency
	 * MandateOccurrences2.Frequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Frequency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateOccurrences3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.Frequency;
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which instructions are to be created and processed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateOccurrences2.Frequency;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.Frequency);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Frequency21Choice.mmObject();
		}
	};
	/**
	 * Length of time for which the mandate remains valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1
	 * DatePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#ValidityPeriod
	 * Agreement.ValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Drtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Length of time for which the mandate remains valid."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#Duration
	 * MandateOccurrences4.Duration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#Duration
	 * MandateOccurrences2.Duration}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Duration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateOccurrences3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.ValidityPeriod;
			isDerived = false;
			xmlTag = "Drtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duration";
			definition = "Length of time for which the mandate remains valid.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateOccurrences2.Duration;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.Duration);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DatePeriodDetails1.mmObject();
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#FirstCollectionDate
	 * DirectDebitMandate.FirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the first collection of a direct debit as per the mandate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#FirstCollectionDate
	 * MandateOccurrences4.FirstCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#FirstCollectionDate
	 * MandateOccurrences2.FirstCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FirstCollectionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateOccurrences3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.FirstCollectionDate;
			isDerived = false;
			xmlTag = "FrstColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateOccurrences2.FirstCollectionDate;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.FirstCollectionDate);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#FinalCollectionDate
	 * DirectDebitMandate.FinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the final collection of a direct debit as per the mandate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#FinalCollectionDate
	 * MandateOccurrences4.FinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#FinalCollectionDate
	 * MandateOccurrences2.FinalCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FinalCollectionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateOccurrences3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.FinalCollectionDate;
			isDerived = false;
			xmlTag = "FnlColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateOccurrences2.FinalCollectionDate;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences4.FinalCollectionDate);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences3.SequenceType, com.tools20022.repository.msg.MandateOccurrences3.Frequency,
						com.tools20022.repository.msg.MandateOccurrences3.Duration, com.tools20022.repository.msg.MandateOccurrences3.FirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences3.FinalCollectionDate);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateOccurrences3";
				definition = "Provides further details related to the duration of the mandate and the occurrence of the underlying transactions.";
				previousVersion_lazy = () -> MandateOccurrences2.mmObject();
				nextVersions_lazy = () -> Arrays.asList(MandateOccurrences4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}