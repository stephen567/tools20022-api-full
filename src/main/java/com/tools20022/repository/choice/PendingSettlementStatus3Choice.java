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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.codeset.PendingSettlementStatusReason2Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.msg.GenericIdentification1;
import com.tools20022.repository.msg.PendingSettlementStatus2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason for the pending settlement status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#Reason
 * PendingSettlementStatus3Choice.Reason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#ExtendedReason
 * PendingSettlementStatus3Choice.ExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#DataSourceScheme
 * PendingSettlementStatus3Choice.DataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#NoSpecifiedReason
 * PendingSettlementStatus3Choice.NoSpecifiedReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
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
 * "PendingSettlementStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for the pending settlement status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2
 * PendingSettlementStatus2}</li>
 * </ul>
 */
public class PendingSettlementStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for the settlement pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#PendingSettlementReason
	 * SecuritiesTradeStatusReason.PendingSettlementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice
	 * PendingSettlementStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the settlement pending status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#Reason
	 * PendingSettlementStatus2.Reason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PendingSettlementStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.PendingSettlementReason;
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the settlement pending status.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.Reason;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * Reason for the settlement pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice
	 * PendingSettlementStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the settlement pending status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#ExtendedReason
	 * PendingSettlementStatus2.ExtendedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExtendedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PendingSettlementStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "Reason for the settlement pending status.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.ExtendedReason;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	/**
	 * Proprietary identification of the reason for the pending settlement
	 * status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#DataSourceScheme
	 * StatusReason.DataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice
	 * PendingSettlementStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSrcSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the reason for the pending settlement status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#DataSourceScheme
	 * PendingSettlementStatus2.DataSourceScheme}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DataSourceScheme = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PendingSettlementStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.DataSourceScheme;
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the pending settlement status.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.DataSourceScheme;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates that there is no reason available or to report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#NoSpecifiedReason
	 * StatusReason.NoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice
	 * PendingSettlementStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoSpcfdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#NoSpecifiedReason
	 * PendingSettlementStatus2.NoSpecifiedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NoSpecifiedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PendingSettlementStatus3Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.NoSpecifiedReason;
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.NoSpecifiedReason;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PendingSettlementStatus3Choice.Reason, com.tools20022.repository.choice.PendingSettlementStatus3Choice.ExtendedReason,
						com.tools20022.repository.choice.PendingSettlementStatus3Choice.DataSourceScheme, com.tools20022.repository.choice.PendingSettlementStatus3Choice.NoSpecifiedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PendingSettlementStatus3Choice";
				definition = "Reason for the pending settlement status.";
				previousVersion_lazy = () -> PendingSettlementStatus2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}