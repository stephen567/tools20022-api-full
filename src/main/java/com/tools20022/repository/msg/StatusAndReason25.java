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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06;
import com.tools20022.repository.choice.Status15Choice;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Transaction40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status and reason of an instructed order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason25#mmStatusAndReason
 * StatusAndReason25.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason25#mmTransaction
 * StatusAndReason25.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmStatus
 * SecuritiesTransactionPendingReportV06.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusAndReason25"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status and reason of an instructed order."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason27
 * StatusAndReason27}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.StatusAndReason18
 * StatusAndReason18}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusAndReason25", propOrder = {"statusAndReason", "transaction"})
public class StatusAndReason25 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsAndRsn", required = true)
	protected Status15Choice statusAndReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Status15Choice
	 * Status15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason25
	 * StatusAndReason25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsAndRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status and reason for the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason27#mmStatusAndReason
	 * StatusAndReason27.mmStatusAndReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason18#mmStatusAndReason
	 * StatusAndReason18.mmStatusAndReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusAndReason25, Status15Choice> mmStatusAndReason = new MMMessageAssociationEnd<StatusAndReason25, Status15Choice>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAndReason25.mmObject();
			isDerived = false;
			xmlTag = "StsAndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReason";
			definition = "Status and reason for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(StatusAndReason27.mmStatusAndReason);
			previousVersion_lazy = () -> StatusAndReason18.mmStatusAndReason;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Status15Choice.mmObject();
		}

		@Override
		public Status15Choice getValue(StatusAndReason25 obj) {
			return obj.getStatusAndReason();
		}

		@Override
		public void setValue(StatusAndReason25 obj, Status15Choice value) {
			obj.setStatusAndReason(value);
		}
	};
	@XmlElement(name = "Tx")
	protected List<Transaction40> transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Transaction40
	 * Transaction40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason25
	 * StatusAndReason25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transactions reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason27#mmTransaction
	 * StatusAndReason27.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason18#mmTransaction
	 * StatusAndReason18.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusAndReason25, List<Transaction40>> mmTransaction = new MMMessageAssociationEnd<StatusAndReason25, List<Transaction40>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAndReason25.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Details of the transactions reported.";
			nextVersions_lazy = () -> Arrays.asList(StatusAndReason27.mmTransaction);
			previousVersion_lazy = () -> StatusAndReason18.mmTransaction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Transaction40.mmObject();
		}

		@Override
		public List<Transaction40> getValue(StatusAndReason25 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(StatusAndReason25 obj, List<Transaction40> value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusAndReason25.mmStatusAndReason, com.tools20022.repository.msg.StatusAndReason25.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV06.mmStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusAndReason25";
				definition = "Status and reason of an instructed order.";
				nextVersions_lazy = () -> Arrays.asList(StatusAndReason27.mmObject());
				previousVersion_lazy = () -> StatusAndReason18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Status15Choice getStatusAndReason() {
		return statusAndReason;
	}

	public StatusAndReason25 setStatusAndReason(Status15Choice statusAndReason) {
		this.statusAndReason = Objects.requireNonNull(statusAndReason);
		return this;
	}

	public List<Transaction40> getTransaction() {
		return transaction == null ? transaction = new ArrayList<>() : transaction;
	}

	public StatusAndReason25 setTransaction(List<Transaction40> transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}