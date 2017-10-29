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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide summary information on entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions4#TotalEntries
 * TotalTransactions4.TotalEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions4#TotalCreditEntries
 * TotalTransactions4.TotalCreditEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions4#TotalDebitEntries
 * TotalTransactions4.TotalDebitEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions4#TotalEntriesPerBankTransactionCode
 * TotalTransactions4.TotalEntriesPerBankTransactionCode}</li>
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
 * "TotalTransactions4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide summary information on entries."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTransactions5
 * TotalTransactions5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TotalTransactions3
 * TotalTransactions3}</li>
 * </ul>
 */
public class TotalTransactions4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the total number and sum of debit and credit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions4
	 * NumberAndSumOfTransactions4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions4
	 * TotalTransactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total number and sum of debit and credit entries."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions5#TotalEntries
	 * TotalTransactions5.TotalEntries}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalEntries = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions4.mmObject();
			isDerived = false;
			xmlTag = "TtlNtries";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEntries";
			definition = "Specifies the total number and sum of debit and credit entries.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTransactions5.TotalEntries);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NumberAndSumOfTransactions4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the total number and sum of credit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions1
	 * NumberAndSumOfTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions4
	 * TotalTransactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCdtNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCreditEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the total number and sum of credit entries."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions5#TotalCreditEntries
	 * TotalTransactions5.TotalCreditEntries}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalCreditEntries = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions4.mmObject();
			isDerived = false;
			xmlTag = "TtlCdtNtries";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCreditEntries";
			definition = "Specifies the total number and sum of credit entries.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTransactions5.TotalCreditEntries);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NumberAndSumOfTransactions1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the total number and sum of debit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions1
	 * NumberAndSumOfTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions4
	 * TotalTransactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDbtNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDebitEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the total number and sum of debit entries."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions5#TotalDebitEntries
	 * TotalTransactions5.TotalDebitEntries}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalDebitEntries = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions4.mmObject();
			isDerived = false;
			xmlTag = "TtlDbtNtries";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDebitEntries";
			definition = "Specifies the total number and sum of debit entries.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTransactions5.TotalDebitEntries);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NumberAndSumOfTransactions1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the total number and sum of entries per bank transaction code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3
	 * TotalsPerBankTransactionCode3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions4
	 * TotalTransactions4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNtriesPerBkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntriesPerBankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total number and sum of entries per bank transaction code."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions5#TotalEntriesPerBankTransactionCode
	 * TotalTransactions5.TotalEntriesPerBankTransactionCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TotalEntriesPerBankTransactionCode = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions4.mmObject();
			isDerived = false;
			xmlTag = "TtlNtriesPerBkTxCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEntriesPerBankTransactionCode";
			definition = "Specifies the total number and sum of entries per bank transaction code.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTransactions5.TotalEntriesPerBankTransactionCode);
			minOccurs = 0;
			type_lazy = () -> TotalsPerBankTransactionCode3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTransactions4.TotalEntries, com.tools20022.repository.msg.TotalTransactions4.TotalCreditEntries,
						com.tools20022.repository.msg.TotalTransactions4.TotalDebitEntries, com.tools20022.repository.msg.TotalTransactions4.TotalEntriesPerBankTransactionCode);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TotalTransactions4";
				definition = "Set of elements used to provide summary information on entries.";
				previousVersion_lazy = () -> TotalTransactions3.mmObject();
				nextVersions_lazy = () -> Arrays.asList(TotalTransactions5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}