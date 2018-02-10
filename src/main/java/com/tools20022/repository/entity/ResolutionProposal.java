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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MeetingNotice1;
import com.tools20022.repository.msg.MeetingNotice2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Conditions that must be met to propose a resolution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ResolutionProposal" src="doc-files/ResolutionProposal.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmResolutionProposalThreshold
 * ResolutionProposal.mmResolutionProposalThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmResolutionProposalThresholdPercentage
 * ResolutionProposal.mmResolutionProposalThresholdPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmMeeting
 * ResolutionProposal.mmMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmResolutionProposalConditions
 * Meeting.mmResolutionProposalConditions}</li>
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
 * "ResolutionProposal"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Conditions that must be met to propose a resolution."</li>
 * </ul>
 */
public class ResolutionProposal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text resolutionProposalThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalThreshold
	 * MeetingNotice1.mmResolutionProposalThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalThreshold
	 * MeetingNotice2.mmResolutionProposalThreshold}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal
	 * ResolutionProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResolutionProposalThreshold = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MeetingNotice1.mmResolutionProposalThreshold, MeetingNotice2.mmResolutionProposalThreshold);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalThreshold";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionProposal.class.getMethod("getResolutionProposalThreshold", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate resolutionProposalThresholdPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalThresholdPercentage
	 * MeetingNotice1.mmResolutionProposalThresholdPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalThresholdPercentage
	 * MeetingNotice2.mmResolutionProposalThresholdPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal
	 * ResolutionProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalThresholdPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResolutionProposalThresholdPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(MeetingNotice1.mmResolutionProposalThresholdPercentage, MeetingNotice2.mmResolutionProposalThresholdPercentage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalThresholdPercentage";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ResolutionProposal.class.getMethod("getResolutionProposalThresholdPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Meeting meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmResolutionProposalConditions
	 * Meeting.mmResolutionProposalConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal
	 * ResolutionProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting for which conditions for proposing a resolution are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which conditions for proposing a resolution are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmResolutionProposalConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResolutionProposal";
				definition = "Conditions that must be met to propose a resolution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmResolutionProposalConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ResolutionProposal.mmResolutionProposalThreshold, com.tools20022.repository.entity.ResolutionProposal.mmResolutionProposalThresholdPercentage,
						com.tools20022.repository.entity.ResolutionProposal.mmMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ResolutionProposal.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getResolutionProposalThreshold() {
		return resolutionProposalThreshold;
	}

	public ResolutionProposal setResolutionProposalThreshold(Max350Text resolutionProposalThreshold) {
		this.resolutionProposalThreshold = Objects.requireNonNull(resolutionProposalThreshold);
		return this;
	}

	public PercentageRate getResolutionProposalThresholdPercentage() {
		return resolutionProposalThresholdPercentage;
	}

	public ResolutionProposal setResolutionProposalThresholdPercentage(PercentageRate resolutionProposalThresholdPercentage) {
		this.resolutionProposalThresholdPercentage = Objects.requireNonNull(resolutionProposalThresholdPercentage);
		return this;
	}

	public Optional<Meeting> getMeeting() {
		return meeting == null ? Optional.empty() : Optional.of(meeting);
	}

	public ResolutionProposal setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
		return this;
	}
}