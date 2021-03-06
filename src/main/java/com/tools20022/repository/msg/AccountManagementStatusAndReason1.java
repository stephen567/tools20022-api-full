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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.acmt.AccountManagementStatusReportV02;
import com.tools20022.repository.codeset.AccountManagementStatus1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AccountStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RejectedStatus5;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status report of a account opening instruction or account modification
 * instruction that was previously received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#StatusOrRejectedRule
 * AccountManagementStatusAndReason1.StatusOrRejectedRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#mmStatus
 * AccountManagementStatusAndReason1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#mmRejected
 * AccountManagementStatusAndReason1.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#mmAccountApplicationIdentification
 * AccountManagementStatusAndReason1.mmAccountApplicationIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountStatus
 * AccountStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#mmStatusReport
 * AccountManagementStatusReportV02.mmStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementStatusAndReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of a account opening instruction or account modification instruction that was previously received."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason2
 * AccountManagementStatusAndReason2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountManagementStatusAndReason1", propOrder = {"status", "rejected", "accountApplicationIdentification"})
public class AccountManagementStatusAndReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected AccountManagementStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code
	 * AccountManagementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmManagementStatus
	 * AccountStatus.mmManagementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1
	 * AccountManagementStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the account opening instruction or account modification instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason1, AccountManagementStatus1Code> mmStatus = new MMMessageAttribute<AccountManagementStatusAndReason1, AccountManagementStatus1Code>() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmManagementStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the account opening instruction or account modification instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementStatus1Code.mmObject();
		}

		@Override
		public AccountManagementStatus1Code getValue(AccountManagementStatusAndReason1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason1 obj, AccountManagementStatus1Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus5 rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus5
	 * RejectedStatus5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1
	 * AccountManagementStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order is rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementStatusAndReason1, RejectedStatus5> mmRejected = new MMMessageAssociationEnd<AccountManagementStatusAndReason1, RejectedStatus5>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the order is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus5.mmObject();
		}

		@Override
		public RejectedStatus5 getValue(AccountManagementStatusAndReason1 obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason1 obj, RejectedStatus5 value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "AcctApplId")
	protected Max35Text accountApplicationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1
	 * AccountManagementStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctApplId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the account opening or modification instruction at application level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason1, Optional<Max35Text>> mmAccountApplicationIdentification = new MMMessageAttribute<AccountManagementStatusAndReason1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account opening or modification instruction at application level.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AccountManagementStatusAndReason1 obj) {
			return obj.getAccountApplicationIdentification();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason1 obj, Optional<Max35Text> value) {
			obj.setAccountApplicationIdentification(value.orElse(null));
		}
	};
	/**
	 * Either Status or Rejected must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1
	 * AccountManagementStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#mmStatus
	 * AccountManagementStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#mmRejected
	 * AccountManagementStatusAndReason1.mmRejected}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOrRejectedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Status or Rejected must be present, but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor StatusOrRejectedRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOrRejectedRule";
			definition = "Either Status or Rejected must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmStatus, com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmRejected);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmStatus, com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmRejected,
						com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmAccountApplicationIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountManagementStatusReportV02.mmStatusReport);
				trace_lazy = () -> AccountStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AccountManagementStatusAndReason1";
				definition = "Status report of a account opening instruction or account modification instruction that was previously received.";
				nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusAndReason2.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason1.StatusOrRejectedRule);
			}
		});
		return mmObject_lazy.get();
	}

	public AccountManagementStatus1Code getStatus() {
		return status;
	}

	public AccountManagementStatusAndReason1 setStatus(AccountManagementStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public RejectedStatus5 getRejected() {
		return rejected;
	}

	public AccountManagementStatusAndReason1 setRejected(RejectedStatus5 rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public Optional<Max35Text> getAccountApplicationIdentification() {
		return accountApplicationIdentification == null ? Optional.empty() : Optional.of(accountApplicationIdentification);
	}

	public AccountManagementStatusAndReason1 setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
		return this;
	}
}