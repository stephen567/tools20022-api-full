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
import com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01;
import com.tools20022.repository.codeset.StatisticalReportingStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyControlRecordStatus1;
import com.tools20022.repository.msg.ValidationStatusReason1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of each package of currency control records.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmPackageIdentification
 * CurrencyControlPackageStatus1.mmPackageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatus
 * CurrencyControlPackageStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatusReason
 * CurrencyControlPackageStatus1.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatusDateTime
 * CurrencyControlPackageStatus1.mmStatusDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmRecordStatus
 * CurrencyControlPackageStatus1.mmRecordStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#mmPackageStatus
 * CurrencyControlStatusAdviceV01.mmPackageStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyControlPackageStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each package of currency control records."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyControlPackageStatus1", propOrder = {"packageIdentification", "status", "statusReason", "statusDateTime", "recordStatus"})
public class CurrencyControlPackageStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PackgId", required = true)
	protected Max35Text packageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
	 * CurrencyControlPackageStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PackgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of each package of transactions and optionally the entry/record within the package of transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyControlPackageStatus1, Max35Text> mmPackageIdentification = new MMMessageAttribute<CurrencyControlPackageStatus1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmObject();
			isDerived = false;
			xmlTag = "PackgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PackageIdentification";
			definition = "Unique and unambiguous identification of each package of transactions and optionally the entry/record within the package of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CurrencyControlPackageStatus1 obj) {
			return obj.getPackageIdentification();
		}

		@Override
		public void setValue(CurrencyControlPackageStatus1 obj, Max35Text value) {
			obj.setPackageIdentification(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected StatisticalReportingStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus1Code
	 * StatisticalReportingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
	 * CurrencyControlPackageStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the status of the reported transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyControlPackageStatus1, StatisticalReportingStatus1Code> mmStatus = new MMMessageAttribute<CurrencyControlPackageStatus1, StatisticalReportingStatus1Code>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatisticalReportingStatus1Code.mmObject();
		}

		@Override
		public StatisticalReportingStatus1Code getValue(CurrencyControlPackageStatus1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CurrencyControlPackageStatus1 obj, StatisticalReportingStatus1Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "StsRsn")
	protected List<ValidationStatusReason1> statusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1
	 * ValidationStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
	 * CurrencyControlPackageStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the status reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyControlPackageStatus1, List<ValidationStatusReason1>> mmStatusReason = new MMMessageAssociationEnd<CurrencyControlPackageStatus1, List<ValidationStatusReason1>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Provides detailed information on the status reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValidationStatusReason1.mmObject();
		}

		@Override
		public List<ValidationStatusReason1> getValue(CurrencyControlPackageStatus1 obj) {
			return obj.getStatusReason();
		}

		@Override
		public void setValue(CurrencyControlPackageStatus1 obj, List<ValidationStatusReason1> value) {
			obj.setStatusReason(value);
		}
	};
	@XmlElement(name = "StsDtTm")
	protected ISODateTime statusDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
	 * CurrencyControlPackageStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date and time when the status was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyControlPackageStatus1, Optional<ISODateTime>> mmStatusDateTime = new MMMessageAttribute<CurrencyControlPackageStatus1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmObject();
			isDerived = false;
			xmlTag = "StsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDateTime";
			definition = "Provides the date and time when the status was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CurrencyControlPackageStatus1 obj) {
			return obj.getStatusDateTime();
		}

		@Override
		public void setValue(CurrencyControlPackageStatus1 obj, Optional<ISODateTime> value) {
			obj.setStatusDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RcrdSts")
	protected List<CurrencyControlRecordStatus1> recordStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
	 * CurrencyControlRecordStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
	 * CurrencyControlPackageStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the individual records in the package."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyControlPackageStatus1, List<CurrencyControlRecordStatus1>> mmRecordStatus = new MMMessageAssociationEnd<CurrencyControlPackageStatus1, List<CurrencyControlRecordStatus1>>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmObject();
			isDerived = false;
			xmlTag = "RcrdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordStatus";
			definition = "Provides the status of the individual records in the package.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyControlRecordStatus1.mmObject();
		}

		@Override
		public List<CurrencyControlRecordStatus1> getValue(CurrencyControlPackageStatus1 obj) {
			return obj.getRecordStatus();
		}

		@Override
		public void setValue(CurrencyControlPackageStatus1 obj, List<CurrencyControlRecordStatus1> value) {
			obj.setRecordStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmPackageIdentification, com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmStatus,
						com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmStatusReason, com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmStatusDateTime,
						com.tools20022.repository.msg.CurrencyControlPackageStatus1.mmRecordStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CurrencyControlStatusAdviceV01.mmPackageStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyControlPackageStatus1";
				definition = "Provides the details of each package of currency control records.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPackageIdentification() {
		return packageIdentification;
	}

	public CurrencyControlPackageStatus1 setPackageIdentification(Max35Text packageIdentification) {
		this.packageIdentification = Objects.requireNonNull(packageIdentification);
		return this;
	}

	public StatisticalReportingStatus1Code getStatus() {
		return status;
	}

	public CurrencyControlPackageStatus1 setStatus(StatisticalReportingStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<ValidationStatusReason1> getStatusReason() {
		return statusReason == null ? statusReason = new ArrayList<>() : statusReason;
	}

	public CurrencyControlPackageStatus1 setStatusReason(List<ValidationStatusReason1> statusReason) {
		this.statusReason = Objects.requireNonNull(statusReason);
		return this;
	}

	public Optional<ISODateTime> getStatusDateTime() {
		return statusDateTime == null ? Optional.empty() : Optional.of(statusDateTime);
	}

	public CurrencyControlPackageStatus1 setStatusDateTime(ISODateTime statusDateTime) {
		this.statusDateTime = statusDateTime;
		return this;
	}

	public List<CurrencyControlRecordStatus1> getRecordStatus() {
		return recordStatus == null ? recordStatus = new ArrayList<>() : recordStatus;
	}

	public CurrencyControlPackageStatus1 setRecordStatus(List<CurrencyControlRecordStatus1> recordStatus) {
		this.recordStatus = Objects.requireNonNull(recordStatus);
		return this;
	}
}