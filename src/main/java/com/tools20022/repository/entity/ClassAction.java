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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Form of lawsuit in which a group of shareholders collectively bring a claim
 * to court, mainly because it would be too expensive for each individual
 * shareholder to launch their own lawsuit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClassAction" src="doc-files/ClassAction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#mmClassActionNumber
 * ClassAction.mmClassActionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#mmLeadPlaintiffDeadline
 * ClassAction.mmLeadPlaintiffDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCourtApprovalDate
 * ClassAction.mmCourtApprovalDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#mmClaimPeriod
 * ClassAction.mmClaimPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#mmFilingDate
 * ClassAction.mmFilingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#mmHearingDate
 * ClassAction.mmHearingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCorporateEvent
 * ClassAction.mmCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmClassAction
 * DateTimePeriod.mmClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedClassAction
 * CorporateActionEvent.mmRelatedClassAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClassAction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Form of lawsuit in which a group of shareholders collectively bring a claim to court, mainly because it would be too expensive for each individual shareholder to launch their own lawsuit."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class ClassAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text classActionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#mmClassActionNumber
	 * CorporateActionGeneralInformation8.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#mmClassActionNumber
	 * CorporateActionGeneralInformation20.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#mmClassActionNumber
	 * CorporateActionGeneralInformation25.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#mmClassActionNumber
	 * CorporateActionGeneralInformation32.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#mmClassActionNumber
	 * CorporateActionGeneralInformation35.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#mmClassActionNumber
	 * CorporateActionGeneralInformation43.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#mmClassActionNumber
	 * CorporateActionGeneralInformation53.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#mmClassActionNumber
	 * CorporateActionGeneralInformation56.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#mmClassActionNumber
	 * CorporateActionGeneralInformation57.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#mmClassActionNumber
	 * CorporateActionGeneralInformation9.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#mmClassActionNumber
	 * CorporateActionGeneralInformation13.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#mmClassActionNumber
	 * CorporateActionGeneralInformation34.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#mmClassActionNumber
	 * CorporateActionGeneralInformation42.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmClassActionNumber
	 * CorporateActionGeneralInformation52.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#mmClassActionNumber
	 * CorporateActionGeneralInformation58.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#mmClassActionNumber
	 * CorporateActionGeneralInformation4.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#mmClassActionNumber
	 * CorporateActionGeneralInformation16.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#mmClassActionNumber
	 * CorporateActionGeneralInformation24.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#mmClassActionNumber
	 * CorporateActionGeneralInformation29.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#mmClassActionNumber
	 * CorporateActionGeneralInformation39.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#mmClassActionNumber
	 * CorporateActionGeneralInformation47.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#mmClassActionNumber
	 * CorporateActionGeneralInformation50.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#mmClassActionNumber
	 * CorporateActionGeneralInformation62.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmClassActionNumber
	 * CorporateActionGeneralInformation3.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmClassActionNumber
	 * CorporateActionGeneralInformation17.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmClassActionNumber
	 * CorporateActionGeneralInformation23.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmClassActionNumber
	 * CorporateActionGeneralInformation30.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmClassActionNumber
	 * CorporateActionGeneralInformation38.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmClassActionNumber
	 * CorporateActionGeneralInformation46.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmClassActionNumber
	 * CorporateActionGeneralInformation54.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmClassActionNumber
	 * CorporateActionGeneralInformation64.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#mmClassActionNumber
	 * CorporateActionGeneralInformation63.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#mmClassActionNumber
	 * CorporateActionGeneralInformation11.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#mmClassActionNumber
	 * CorporateActionGeneralInformation19.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#mmClassActionNumber
	 * CorporateActionGeneralInformation22.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#mmClassActionNumber
	 * CorporateActionGeneralInformation31.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#mmClassActionNumber
	 * CorporateActionGeneralInformation37.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#mmClassActionNumber
	 * CorporateActionGeneralInformation45.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#mmClassActionNumber
	 * CorporateActionGeneralInformation51.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#mmClassActionNumber
	 * CorporateActionGeneralInformation67.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#mmClassActionNumber
	 * CorporateActionGeneralInformation12.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmClassActionNumber
	 * CorporateActionGeneralInformation69.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#mmClassActionNumber
	 * CorporateActionGeneralInformation70.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmClassActionNumber
	 * CorporateActionGeneralInformation78.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#mmClassActionNumber
	 * CorporateActionGeneralInformation76.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#mmClassActionNumber
	 * CorporateActionGeneralInformation79.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#mmClassActionNumber
	 * CorporateActionGeneralInformation83.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#mmClassActionNumber
	 * CorporateActionGeneralInformation82.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#mmClassActionNumber
	 * CorporateActionGeneralInformation89.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#mmClassActionNumber
	 * CorporateActionGeneralInformation86.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmClassActionNumber
	 * CorporateActionGeneralInformation91.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#mmClassActionNumber
	 * CorporateActionGeneralInformation87.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#mmClassActionNumber
	 * CorporateActionGeneralInformation84.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#mmClassActionNumber
	 * CorporateActionGeneralInformation85.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#mmClassActionNumber
	 * CorporateActionGeneralInformation93.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmClassActionNumber
	 * CorporateActionGeneralInformation98.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#mmClassActionNumber
	 * CorporateActionGeneralInformation100.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#mmClassActionNumber
	 * CorporateActionGeneralInformation99.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#mmClassActionNumber
	 * CorporateActionGeneralInformation94.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#mmClassActionNumber
	 * CorporateActionGeneralInformation103.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmClassActionNumber
	 * CorporateActionGeneralInformation109.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmClassActionNumber
	 * CorporateActionGeneralInformation111.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmClassActionNumber
	 * CorporateActionGeneralInformation112.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmClassActionNumber
	 * CorporateActionGeneralInformation105.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmClassActionNumber
	 * CorporateActionGeneralInformation106.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmClassActionNumber
	 * CorporateActionGeneralInformation108.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#mmClassActionNumber
	 * CorporateActionGeneralInformation114.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#mmClassActionNumber
	 * CorporateActionGeneralInformation120.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#mmClassActionNumber
	 * CorporateActionGeneralInformation118.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#mmClassActionNumber
	 * CorporateActionGeneralInformation123.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#mmClassActionNumber
	 * CorporateActionGeneralInformation117.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#mmClassActionNumber
	 * CorporateActionGeneralInformation113.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmClassActionNumber
	 * CorporateActionGeneralInformation127.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmClassActionNumber
	 * CorporateActionGeneralInformation126.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmClassActionNumber
	 * CorporateActionGeneralInformation125.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmClassActionNumber
	 * CorporateActionGeneralInformation124.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmClassActionNumber
	 * CorporateActionGeneralInformation128.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation129#mmClassActionNumber
	 * CorporateActionGeneralInformation129.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation130#mmClassActionNumber
	 * CorporateActionGeneralInformation130.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation131#mmClassActionNumber
	 * CorporateActionGeneralInformation131.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmClassActionNumber
	 * CorporateActionGeneralInformation132.mmClassActionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134#mmClassActionNumber
	 * CorporateActionGeneralInformation134.mmClassActionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference assigned by a court to a class action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ClassAction, Max35Text> mmClassActionNumber = new MMBusinessAttribute<ClassAction, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation8.mmClassActionNumber, CorporateActionGeneralInformation20.mmClassActionNumber, CorporateActionGeneralInformation25.mmClassActionNumber,
					CorporateActionGeneralInformation32.mmClassActionNumber, CorporateActionGeneralInformation35.mmClassActionNumber, CorporateActionGeneralInformation43.mmClassActionNumber,
					CorporateActionGeneralInformation53.mmClassActionNumber, CorporateActionGeneralInformation56.mmClassActionNumber, CorporateActionGeneralInformation57.mmClassActionNumber,
					CorporateActionGeneralInformation9.mmClassActionNumber, CorporateActionGeneralInformation13.mmClassActionNumber, CorporateActionGeneralInformation34.mmClassActionNumber,
					CorporateActionGeneralInformation42.mmClassActionNumber, CorporateActionGeneralInformation52.mmClassActionNumber, CorporateActionGeneralInformation58.mmClassActionNumber,
					CorporateActionGeneralInformation4.mmClassActionNumber, CorporateActionGeneralInformation16.mmClassActionNumber, CorporateActionGeneralInformation24.mmClassActionNumber,
					CorporateActionGeneralInformation29.mmClassActionNumber, CorporateActionGeneralInformation39.mmClassActionNumber, CorporateActionGeneralInformation47.mmClassActionNumber,
					CorporateActionGeneralInformation50.mmClassActionNumber, CorporateActionGeneralInformation62.mmClassActionNumber, CorporateActionGeneralInformation3.mmClassActionNumber,
					CorporateActionGeneralInformation17.mmClassActionNumber, CorporateActionGeneralInformation23.mmClassActionNumber, CorporateActionGeneralInformation30.mmClassActionNumber,
					CorporateActionGeneralInformation38.mmClassActionNumber, CorporateActionGeneralInformation46.mmClassActionNumber, CorporateActionGeneralInformation54.mmClassActionNumber,
					CorporateActionGeneralInformation64.mmClassActionNumber, CorporateActionGeneralInformation63.mmClassActionNumber, CorporateActionGeneralInformation11.mmClassActionNumber,
					CorporateActionGeneralInformation19.mmClassActionNumber, CorporateActionGeneralInformation22.mmClassActionNumber, CorporateActionGeneralInformation31.mmClassActionNumber,
					CorporateActionGeneralInformation37.mmClassActionNumber, CorporateActionGeneralInformation45.mmClassActionNumber, CorporateActionGeneralInformation51.mmClassActionNumber,
					CorporateActionGeneralInformation67.mmClassActionNumber, CorporateActionGeneralInformation12.mmClassActionNumber, CorporateActionGeneralInformation69.mmClassActionNumber,
					CorporateActionGeneralInformation70.mmClassActionNumber, CorporateActionGeneralInformation78.mmClassActionNumber, CorporateActionGeneralInformation76.mmClassActionNumber,
					CorporateActionGeneralInformation79.mmClassActionNumber, CorporateActionGeneralInformation83.mmClassActionNumber, CorporateActionGeneralInformation82.mmClassActionNumber,
					CorporateActionGeneralInformation89.mmClassActionNumber, CorporateActionGeneralInformation86.mmClassActionNumber, CorporateActionGeneralInformation91.mmClassActionNumber,
					CorporateActionGeneralInformation87.mmClassActionNumber, CorporateActionGeneralInformation84.mmClassActionNumber, CorporateActionGeneralInformation85.mmClassActionNumber,
					CorporateActionGeneralInformation93.mmClassActionNumber, CorporateActionGeneralInformation98.mmClassActionNumber, CorporateActionGeneralInformation100.mmClassActionNumber,
					CorporateActionGeneralInformation99.mmClassActionNumber, CorporateActionGeneralInformation94.mmClassActionNumber, CorporateActionGeneralInformation103.mmClassActionNumber,
					CorporateActionGeneralInformation109.mmClassActionNumber, CorporateActionGeneralInformation111.mmClassActionNumber, CorporateActionGeneralInformation112.mmClassActionNumber,
					CorporateActionGeneralInformation105.mmClassActionNumber, CorporateActionGeneralInformation106.mmClassActionNumber, CorporateActionGeneralInformation108.mmClassActionNumber,
					CorporateActionGeneralInformation114.mmClassActionNumber, CorporateActionGeneralInformation120.mmClassActionNumber, CorporateActionGeneralInformation118.mmClassActionNumber,
					CorporateActionGeneralInformation123.mmClassActionNumber, CorporateActionGeneralInformation117.mmClassActionNumber, CorporateActionGeneralInformation113.mmClassActionNumber,
					CorporateActionGeneralInformation127.mmClassActionNumber, CorporateActionGeneralInformation126.mmClassActionNumber, CorporateActionGeneralInformation125.mmClassActionNumber,
					CorporateActionGeneralInformation124.mmClassActionNumber, CorporateActionGeneralInformation128.mmClassActionNumber, CorporateActionGeneralInformation129.mmClassActionNumber,
					CorporateActionGeneralInformation130.mmClassActionNumber, CorporateActionGeneralInformation131.mmClassActionNumber, CorporateActionGeneralInformation132.mmClassActionNumber,
					CorporateActionGeneralInformation134.mmClassActionNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassActionNumber";
			definition = "Reference assigned by a court to a class action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ClassAction obj) {
			return obj.getClassActionNumber();
		}

		@Override
		public void setValue(ClassAction obj, Max35Text value) {
			obj.setClassActionNumber(value);
		}
	};
	protected ISODateTime leadPlaintiffDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmLeadPlaintiffDeadline
	 * CorporateActionDate8.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmLeadPlaintiffDeadline
	 * CorporateActionDate11.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmLeadPlaintiffDeadline
	 * CorporateActionDate14.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmLeadPlaintiffDeadline
	 * CorporateActionDate21.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmLeadPlaintiffDeadline
	 * CorporateActionDate22.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmLeadPlaintiffDeadline
	 * CorporateActionDate25.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmLeadPlaintiffDeadline
	 * CorporateActionDate27.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmLeadPlaintiffDeadline
	 * CorporateActionDate28.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLeadPlaintiffDeadline
	 * CorporateActionDate44.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmLeadPlaintiffDeadline
	 * CorporateActionDate58.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLeadPlaintiffDeadline
	 * CorporateActionDate61.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmLeadPlaintiffDeadline
	 * CorporateActionDate74.mmLeadPlaintiffDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LeadPlaintiffDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day an investor can become a lead plaintiff."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ClassAction, ISODateTime> mmLeadPlaintiffDeadline = new MMBusinessAttribute<ClassAction, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate8.mmLeadPlaintiffDeadline, CorporateActionDate11.mmLeadPlaintiffDeadline, CorporateActionDate14.mmLeadPlaintiffDeadline, CorporateActionDate21.mmLeadPlaintiffDeadline,
					CorporateActionDate22.mmLeadPlaintiffDeadline, CorporateActionDate25.mmLeadPlaintiffDeadline, CorporateActionDate27.mmLeadPlaintiffDeadline, CorporateActionDate28.mmLeadPlaintiffDeadline,
					CorporateActionDate44.mmLeadPlaintiffDeadline, CorporateActionDate58.mmLeadPlaintiffDeadline, CorporateActionDate61.mmLeadPlaintiffDeadline, CorporateActionDate74.mmLeadPlaintiffDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ClassAction obj) {
			return obj.getLeadPlaintiffDeadline();
		}

		@Override
		public void setValue(ClassAction obj, ISODateTime value) {
			obj.setLeadPlaintiffDeadline(value);
		}
	};
	protected ISODateTime courtApprovalDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmCourtApprovalDate
	 * CorporateActionDate1.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmCourtApprovalDate
	 * CorporateActionDate13.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmCourtApprovalDate
	 * CorporateActionDate14.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmCourtApprovalDate
	 * CorporateActionDate21.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmCourtApprovalDate
	 * CorporateActionDate22.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmCourtApprovalDate
	 * CorporateActionDate25.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmCourtApprovalDate
	 * CorporateActionDate27.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmCourtApprovalDate
	 * CorporateActionDate28.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmCourtApprovalDate
	 * CorporateActionDate2.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmCourtApprovalDate
	 * CorporateActionDate44.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmCourtApprovalDate
	 * CorporateActionDate58.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmCourtApprovalDate
	 * CorporateActionDate61.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmCourtApprovalDate
	 * CorporateActionDate74.mmCourtApprovalDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtApprovalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the High Court provided approval."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ClassAction, ISODateTime> mmCourtApprovalDate = new MMBusinessAttribute<ClassAction, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmCourtApprovalDate, CorporateActionDate13.mmCourtApprovalDate, CorporateActionDate14.mmCourtApprovalDate, CorporateActionDate21.mmCourtApprovalDate,
					CorporateActionDate22.mmCourtApprovalDate, CorporateActionDate25.mmCourtApprovalDate, CorporateActionDate27.mmCourtApprovalDate, CorporateActionDate28.mmCourtApprovalDate, CorporateActionDate2.mmCourtApprovalDate,
					CorporateActionDate44.mmCourtApprovalDate, CorporateActionDate58.mmCourtApprovalDate, CorporateActionDate61.mmCourtApprovalDate, CorporateActionDate74.mmCourtApprovalDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the High Court provided approval.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ClassAction obj) {
			return obj.getCourtApprovalDate();
		}

		@Override
		public void setValue(ClassAction obj, ISODateTime value) {
			obj.setCourtApprovalDate(value);
		}
	};
	protected DateTimePeriod claimPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmClassAction
	 * DateTimePeriod.mmClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmClaimPeriod
	 * CorporateActionPeriod3.mmClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmClaimPeriod
	 * CorporateActionPeriod6.mmClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmClaimPeriod
	 * CorporateActionPeriod8.mmClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmClaimPeriod
	 * CorporateActionPeriod10.mmClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmClaimPeriod
	 * CorporateActionPeriod14.mmClaimPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ClassAction, DateTimePeriod> mmClaimPeriod = new MMBusinessAssociationEnd<ClassAction, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmClaimPeriod, CorporateActionPeriod6.mmClaimPeriod, CorporateActionPeriod8.mmClaimPeriod, CorporateActionPeriod10.mmClaimPeriod,
					CorporateActionPeriod14.mmClaimPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClaimPeriod";
			definition = "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmClassAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(ClassAction obj) {
			return obj.getClaimPeriod();
		}

		@Override
		public void setValue(ClassAction obj, DateTimePeriod value) {
			obj.setClaimPeriod(value);
		}
	};
	protected ISODateTime filingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmFilingDate
	 * CorporateActionDate22.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmFilingDate
	 * CorporateActionDate25.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmFilingDate
	 * CorporateActionDate27.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmFilingDate
	 * CorporateActionDate28.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFilingDate
	 * CorporateActionDate44.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmFilingDate
	 * CorporateActionDate58.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmFilingDate
	 * CorporateActionDate61.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmFilingDate
	 * CorporateActionDate74.mmFilingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FilingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the action was filed at the applicable court."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ClassAction, ISODateTime> mmFilingDate = new MMBusinessAttribute<ClassAction, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate22.mmFilingDate, CorporateActionDate25.mmFilingDate, CorporateActionDate27.mmFilingDate, CorporateActionDate28.mmFilingDate, CorporateActionDate44.mmFilingDate,
					CorporateActionDate58.mmFilingDate, CorporateActionDate61.mmFilingDate, CorporateActionDate74.mmFilingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FilingDate";
			definition = "Date on which the action was filed at the applicable court.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ClassAction obj) {
			return obj.getFilingDate();
		}

		@Override
		public void setValue(ClassAction obj, ISODateTime value) {
			obj.setFilingDate(value);
		}
	};
	protected ISODateTime hearingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmHearingDate
	 * CorporateActionDate22.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmHearingDate
	 * CorporateActionDate25.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmHearingDate
	 * CorporateActionDate27.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmHearingDate
	 * CorporateActionDate28.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmHearingDate
	 * CorporateActionDate44.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmHearingDate
	 * CorporateActionDate58.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmHearingDate
	 * CorporateActionDate61.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmHearingDate
	 * CorporateActionDate74.mmHearingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HearingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date for the hearing between the plaintiff and defendant, as set by the court."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ClassAction, ISODateTime> mmHearingDate = new MMBusinessAttribute<ClassAction, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate22.mmHearingDate, CorporateActionDate25.mmHearingDate, CorporateActionDate27.mmHearingDate, CorporateActionDate28.mmHearingDate, CorporateActionDate44.mmHearingDate,
					CorporateActionDate58.mmHearingDate, CorporateActionDate61.mmHearingDate, CorporateActionDate74.mmHearingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HearingDate";
			definition = "Date for the hearing between the plaintiff and defendant, as set by the court.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ClassAction obj) {
			return obj.getHearingDate();
		}

		@Override
		public void setValue(ClassAction obj, ISODateTime value) {
			obj.setHearingDate(value);
		}
	};
	protected CorporateActionEvent corporateEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedClassAction
	 * CorporateActionEvent.mmRelatedClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction ClassAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which class action is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ClassAction, Optional<CorporateActionEvent>> mmCorporateEvent = new MMBusinessAssociationEnd<ClassAction, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which class action is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmRelatedClassAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(ClassAction obj) {
			return obj.getCorporateEvent();
		}

		@Override
		public void setValue(ClassAction obj, Optional<CorporateActionEvent> value) {
			obj.setCorporateEvent(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClassAction";
				definition = "Form of lawsuit in which a group of shareholders collectively bring a claim to court, mainly because it would be too expensive for each individual shareholder to launch their own lawsuit.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmClassAction, CorporateActionEvent.mmRelatedClassAction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClassAction.mmClassActionNumber, com.tools20022.repository.entity.ClassAction.mmLeadPlaintiffDeadline,
						com.tools20022.repository.entity.ClassAction.mmCourtApprovalDate, com.tools20022.repository.entity.ClassAction.mmClaimPeriod, com.tools20022.repository.entity.ClassAction.mmFilingDate,
						com.tools20022.repository.entity.ClassAction.mmHearingDate, com.tools20022.repository.entity.ClassAction.mmCorporateEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ClassAction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClassActionNumber() {
		return classActionNumber;
	}

	public ClassAction setClassActionNumber(Max35Text classActionNumber) {
		this.classActionNumber = Objects.requireNonNull(classActionNumber);
		return this;
	}

	public ISODateTime getLeadPlaintiffDeadline() {
		return leadPlaintiffDeadline;
	}

	public ClassAction setLeadPlaintiffDeadline(ISODateTime leadPlaintiffDeadline) {
		this.leadPlaintiffDeadline = Objects.requireNonNull(leadPlaintiffDeadline);
		return this;
	}

	public ISODateTime getCourtApprovalDate() {
		return courtApprovalDate;
	}

	public ClassAction setCourtApprovalDate(ISODateTime courtApprovalDate) {
		this.courtApprovalDate = Objects.requireNonNull(courtApprovalDate);
		return this;
	}

	public DateTimePeriod getClaimPeriod() {
		return claimPeriod;
	}

	public ClassAction setClaimPeriod(DateTimePeriod claimPeriod) {
		this.claimPeriod = Objects.requireNonNull(claimPeriod);
		return this;
	}

	public ISODateTime getFilingDate() {
		return filingDate;
	}

	public ClassAction setFilingDate(ISODateTime filingDate) {
		this.filingDate = Objects.requireNonNull(filingDate);
		return this;
	}

	public ISODateTime getHearingDate() {
		return hearingDate;
	}

	public ClassAction setHearingDate(ISODateTime hearingDate) {
		this.hearingDate = Objects.requireNonNull(hearingDate);
		return this;
	}

	public Optional<CorporateActionEvent> getCorporateEvent() {
		return corporateEvent == null ? Optional.empty() : Optional.of(corporateEvent);
	}

	public ClassAction setCorporateEvent(CorporateActionEvent corporateEvent) {
		this.corporateEvent = corporateEvent;
		return this;
	}
}