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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionNotificationV06;
import com.tools20022.repository.area.seev.CorporateActionNotificationV07;
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;
import com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice;
import com.tools20022.repository.codeset.CorporateActionNotificationType1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionNotification;
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
 * Corporate action event notification status and contents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmNotificationType
 * CorporateActionNotification5.mmNotificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmProcessingStatus
 * CorporateActionNotification5.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmEligibleBalanceIndicator
 * CorporateActionNotification5.mmEligibleBalanceIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
 * CorporateActionNotification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmNotificationGeneralInformation
 * CorporateActionNotificationV06.mmNotificationGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmNotificationGeneralInformation
 * CorporateActionNotificationV07.mmNotificationGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmNotificationGeneralInformation
 * CorporateActionNotificationV08.mmNotificationGeneralInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Corporate action event notification status and contents."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification5
 * ConstraintNotificationTypeGuideline.forCorporateActionNotification5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification6
 * CorporateActionNotification6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4
 * CorporateActionNotification4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotification5", propOrder = {"notificationType", "processingStatus", "eligibleBalanceIndicator"})
public class CorporateActionNotification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnTp", required = true)
	protected CorporateActionNotificationType1Code notificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code
	 * CorporateActionNotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmNotificationType
	 * CorporateActionNotification.mmNotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5
	 * CorporateActionNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :23G:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#mmNotificationType
	 * CorporateActionNotification6.mmNotificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmNotificationType
	 * CorporateActionNotification4.mmNotificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotification5, CorporateActionNotificationType1Code> mmNotificationType = new MMMessageAttribute<CorporateActionNotification5, CorporateActionNotificationType1Code>() {
		{
			businessElementTrace_lazy = () -> CorporateActionNotification.mmNotificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotification5.mmObject();
			isDerived = false;
			xmlTag = "NtfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":23G:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationType";
			definition = "Specifies the type of notification.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification6.mmNotificationType);
			previousVersion_lazy = () -> CorporateActionNotification4.mmNotificationType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionNotificationType1Code.mmObject();
		}

		@Override
		public CorporateActionNotificationType1Code getValue(CorporateActionNotification5 obj) {
			return obj.getNotificationType();
		}

		@Override
		public void setValue(CorporateActionNotification5 obj, CorporateActionNotificationType1Code value) {
			obj.setNotificationType(value);
		}
	};
	@XmlElement(name = "PrcgSts", required = true)
	protected CorporateActionProcessingStatus5Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus5Choice
	 * CorporateActionProcessingStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
	 * CorporateActionEvent.mmCorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5
	 * CorporateActionNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the details of the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::PROC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#mmProcessingStatus
	 * CorporateActionNotification6.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmProcessingStatus
	 * CorporateActionNotification4.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNotification5, CorporateActionProcessingStatus5Choice> mmProcessingStatus = new MMMessageAssociationEnd<CorporateActionNotification5, CorporateActionProcessingStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotification5.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::PROC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification6.mmProcessingStatus);
			previousVersion_lazy = () -> CorporateActionNotification4.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionProcessingStatus5Choice.mmObject();
		}

		@Override
		public CorporateActionProcessingStatus5Choice getValue(CorporateActionNotification5 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(CorporateActionNotification5 obj, CorporateActionProcessingStatus5Choice value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "ElgblBalInd")
	protected YesNoIndicator eligibleBalanceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalanceIndicator
	 * CorporateActionEntitlement.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5
	 * CorporateActionNotification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblBalInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#mmEligibleBalanceIndicator
	 * CorporateActionNotification6.mmEligibleBalanceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmEligibleBalanceIndicator
	 * CorporateActionNotification4.mmEligibleBalanceIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotification5, Optional<YesNoIndicator>> mmEligibleBalanceIndicator = new MMMessageAttribute<CorporateActionNotification5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalanceIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotification5.mmObject();
			isDerived = false;
			xmlTag = "ElgblBalInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleBalanceIndicator";
			definition = "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification6.mmEligibleBalanceIndicator);
			previousVersion_lazy = () -> CorporateActionNotification4.mmEligibleBalanceIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionNotification5 obj) {
			return obj.getEligibleBalanceIndicator();
		}

		@Override
		public void setValue(CorporateActionNotification5 obj, Optional<YesNoIndicator> value) {
			obj.setEligibleBalanceIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotification5.mmNotificationType, com.tools20022.repository.msg.CorporateActionNotification5.mmProcessingStatus,
						com.tools20022.repository.msg.CorporateActionNotification5.mmEligibleBalanceIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV06.mmNotificationGeneralInformation, CorporateActionNotificationV07.mmNotificationGeneralInformation,
						CorporateActionNotificationV08.mmNotificationGeneralInformation);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification5";
				definition = "Corporate action event notification status and contents.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification6.mmObject());
				previousVersion_lazy = () -> CorporateActionNotification4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionNotificationType1Code getNotificationType() {
		return notificationType;
	}

	public CorporateActionNotification5 setNotificationType(CorporateActionNotificationType1Code notificationType) {
		this.notificationType = Objects.requireNonNull(notificationType);
		return this;
	}

	public CorporateActionProcessingStatus5Choice getProcessingStatus() {
		return processingStatus;
	}

	public CorporateActionNotification5 setProcessingStatus(CorporateActionProcessingStatus5Choice processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public Optional<YesNoIndicator> getEligibleBalanceIndicator() {
		return eligibleBalanceIndicator == null ? Optional.empty() : Optional.of(eligibleBalanceIndicator);
	}

	public CorporateActionNotification5 setEligibleBalanceIndicator(YesNoIndicator eligibleBalanceIndicator) {
		this.eligibleBalanceIndicator = eligibleBalanceIndicator;
		return this;
	}
}