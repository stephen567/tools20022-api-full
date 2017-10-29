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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.EntitlementAssessment;
import com.tools20022.repository.msg.EntitlementAssessment1;
import com.tools20022.repository.msg.EntitlementAssessment2;
import com.tools20022.repository.msg.EntitlementAssessment3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Notification of the entitlement that one party has in relation with a
 * specific meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingEntitlement" src="doc-files/MeetingEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EntitlementFixingDate
 * MeetingEntitlement.EntitlementFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EntitlementRatio
 * MeetingEntitlement.EntitlementRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EligiblePosition
 * MeetingEntitlement.EligiblePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#RelatedServicing
 * MeetingEntitlement.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#EntitlementCalculationDate
 * MeetingEntitlement.EntitlementCalculationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#RelatedMeetingEntitlement
 * SecuritiesBalance.RelatedMeetingEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingEntitlement
 * MeetingServicing.MeetingEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice#EntitlementDescription
 * Entitlement1Choice.EntitlementDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#Entitlement
 * EntitlementAssessment2.Entitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#Entitlement
 * EntitlementAssessment3.Entitlement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#Entitlement
 * Resolution3.Entitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAssessment
 * EntitlementAssessment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAssessment1
 * EntitlementAssessment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAssessment2
 * EntitlementAssessment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAssessment3
 * EntitlementAssessment3}</li>
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
 * "MeetingEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Notification of the entitlement that one party has in relation with a specific meeting."
 * </li>
 * </ul>
 */
public class MeetingEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date at which the positions are struck to note which parties will receive
	 * the entitlement, e.g. record date, book close date...
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance2#Date
	 * HoldingBalance2.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance3#Date
	 * HoldingBalance3.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#EntitlementFixingDate
	 * EntitlementAssessment1.EntitlementFixingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance6#Date
	 * HoldingBalance6.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#EntitlementFixingDate
	 * EntitlementAssessment2.EntitlementFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates1#EntitlementFixingDate
	 * EligibilityDates1.EntitlementFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#EntitlementFixingDate
	 * EntitlementAssessment3.EntitlementFixingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7#Date
	 * HoldingBalance7.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date..."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntitlementFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HoldingBalance2.Date, com.tools20022.repository.msg.HoldingBalance3.Date, com.tools20022.repository.msg.EntitlementAssessment1.EntitlementFixingDate,
					com.tools20022.repository.msg.HoldingBalance6.Date, com.tools20022.repository.msg.EntitlementAssessment2.EntitlementFixingDate, com.tools20022.repository.msg.EligibilityDates1.EntitlementFixingDate,
					com.tools20022.repository.msg.EntitlementAssessment3.EntitlementFixingDate, com.tools20022.repository.msg.HoldingBalance7.Date);
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitlementFixingDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date...";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of votes assigned to one security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#EntitlementRatio
	 * EntitlementAssessment.EntitlementRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#EntitlementRatio
	 * EntitlementAssessment1.EntitlementRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice#EntitlementRatio
	 * Entitlement1Choice.EntitlementRatio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes assigned to one security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntitlementRatio = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAssessment.EntitlementRatio, com.tools20022.repository.msg.EntitlementAssessment1.EntitlementRatio,
					com.tools20022.repository.choice.Entitlement1Choice.EntitlementRatio);
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitlementRatio";
			definition = "Number of votes assigned to one security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Amount of securities that are eligible for the vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#RelatedMeetingEntitlement
	 * SecuritiesBalance.RelatedMeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligiblePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of securities that are eligible for the vote."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EligiblePosition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligiblePosition";
			definition = "Amount of securities that are eligible for the vote.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.RelatedMeetingEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Services which include the entitlement calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingEntitlement
	 * MeetingServicing.MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Services which include the entitlement calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Services which include the entitlement calculation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MeetingServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at which the positions are calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementCalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the positions are calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntitlementCalculationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitlementCalculationDate";
			definition = "Date at which the positions are calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingEntitlement";
				definition = "Notification of the entitlement that one party has in relation with a specific meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.RelatedMeetingEntitlement, com.tools20022.repository.entity.MeetingServicing.MeetingEntitlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Entitlement1Choice.EntitlementDescription, com.tools20022.repository.msg.EntitlementAssessment2.Entitlement,
						com.tools20022.repository.msg.EntitlementAssessment3.Entitlement, com.tools20022.repository.msg.Resolution3.Entitlement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingEntitlement.EntitlementFixingDate, com.tools20022.repository.entity.MeetingEntitlement.EntitlementRatio,
						com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition, com.tools20022.repository.entity.MeetingEntitlement.RelatedServicing,
						com.tools20022.repository.entity.MeetingEntitlement.EntitlementCalculationDate);
				derivationComponent_lazy = () -> Arrays.asList(EntitlementAssessment.mmObject(), EntitlementAssessment1.mmObject(), EntitlementAssessment2.mmObject(), EntitlementAssessment3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}