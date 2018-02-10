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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LongQuantityToQuantityRatio2;
import com.tools20022.repository.msg.QuantityToQuantityRatio1;
import com.tools20022.repository.msg.QuantityToQuantityRatio2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Ratio expressed as a quotient of quantities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="QuantityRatio" src="doc-files/QuantityRatio.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForResultantSecuritiesProceedsDefinition
 * QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmQuantity1
 * QuantityRatio.mmQuantity1}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmQuantity2
 * QuantityRatio.mmQuantity2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition
 * QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToOldProceedsDefinition
 * QuantityRatio.mmNewToOldProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToUnderlyingProceedsDefinition
 * QuantityRatio.mmNewToUnderlyingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmIntermediateSecuritiesProceedsDefinition
 * QuantityRatio.mmIntermediateSecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmwarrant
 * QuantityRatio.mmwarrant}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmWarrantParity
 * Warrant.mmWarrantParity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
 * SecuritiesProceedsDefinition.
 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
 * SecuritiesProceedsDefinition.mmNewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesToUnderlyingRatio
 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat3Choice#mmQuantityToQuantity
 * RatioFormat3Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#mmQuantityToQuantity
 * RatioFormat4Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat7Choice#mmQuantityToQuantity
 * RatioFormat7Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#mmQuantityToQuantity
 * RatioFormat8Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#mmQuantityToQuantity
 * RatioFormat15Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice#mmQuantityToQuantity
 * RatioFormat16Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice#mmQuantityToQuantity
 * RatioFormat5Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#mmQuantityToQuantity
 * RatioFormat6Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat9Choice#mmQuantityToQuantity
 * RatioFormat9Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#mmQuantityToQuantity
 * RatioFormat10Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat11Choice#mmQuantityToQuantity
 * RatioFormat11Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#mmQuantityToQuantity
 * RatioFormat12Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat13Choice#mmQuantityToQuantity
 * RatioFormat13Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#mmQuantityToQuantity
 * RatioFormat14Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmQuantityToQuantity
 * RatioFormat2Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat1Choice#mmQuantityToQuantity
 * RatioFormat1Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#mmQuantityToQuantity
 * RatioFormat19Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice#mmQuantityToQuantity
 * RatioFormat17Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#mmQuantityToQuantity
 * RatioFormat18Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat20Choice#mmQuantityToQuantity
 * RatioFormat20Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#mmQuantityToQuantity
 * RatioFormat22Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmQuantityToQuantity
 * RatioFormat24Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat23Choice#mmQuantityToQuantity
 * RatioFormat23Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat21Choice#mmQuantityToQuantity
 * RatioFormat21Choice.mmQuantityToQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
 * QuantityToQuantityRatio1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2
 * QuantityToQuantityRatio2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2
 * LongQuantityToQuantityRatio2}</li>
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
 * "QuantityRatio"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Ratio expressed as a quotient of quantities."</li>
 * </ul>
 */
public class QuantityRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesProceedsDefinition additionalQuantityForResultantSecuritiesProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForResultantSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an additional quantity for subscribed resultant securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalQuantityForResultantSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForResultantSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for subscribed resultant securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected DecimalNumber quantity1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1#mmQuantity1
	 * QuantityToQuantityRatio1.mmQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2#mmQuantity1
	 * QuantityToQuantityRatio2.mmQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2#mmLongQuantity1
	 * LongQuantityToQuantityRatio2.mmLongQuantity1}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numerator of the quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuantity1 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityToQuantityRatio1.mmQuantity1, QuantityToQuantityRatio2.mmQuantity1, LongQuantityToQuantityRatio2.mmLongQuantity1);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity1";
			definition = "Numerator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return QuantityRatio.class.getMethod("getQuantity1", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber quantity2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1#mmQuantity2
	 * QuantityToQuantityRatio1.mmQuantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2#mmQuantity2
	 * QuantityToQuantityRatio2.mmQuantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2#mmLongQuantity2
	 * LongQuantityToQuantityRatio2.mmLongQuantity2}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denominator of the quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuantity2 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityToQuantityRatio1.mmQuantity2, QuantityToQuantityRatio2.mmQuantity2, LongQuantityToQuantityRatio2.mmLongQuantity2);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity2";
			definition = "Denominator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return QuantityRatio.class.getMethod("getQuantity2", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesProceedsDefinition additionalQuantityForSubscribedSecuritiesProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an additional quantity for existing securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for existing securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition newToOldProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
	 * SecuritiesProceedsDefinition.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOldProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities procceds for which a nwe to old ratio is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewToOldProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewToOldProceedsDefinition";
			definition = "Securities procceds for which a nwe to old ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewToOld;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition newToUnderlyingProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
	 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToUnderlyingProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a new to underlying ratio is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewToUnderlyingProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewToUnderlyingProceedsDefinition";
			definition = "Securities proceeds for which a new to underlying ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition intermediateSecuritiesProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesToUnderlyingRatio
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a quantity of intermediate securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIntermediateSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which a quantity of intermediate securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected Warrant warrant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmWarrantParity
	 * Warrant.mmWarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the warrant for the related quantity or the underlying quantity. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmwarrant = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "warrant";
			definition = "Provides the warrant for the related quantity or the underlying quantity. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.mmWarrantParity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityRatio";
				definition = "Ratio expressed as a quotient of quantities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Warrant.mmWarrantParity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewToOld,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio);
				derivationElement_lazy = () -> Arrays.asList(RatioFormat3Choice.mmQuantityToQuantity, RatioFormat4Choice.mmQuantityToQuantity, RatioFormat7Choice.mmQuantityToQuantity, RatioFormat8Choice.mmQuantityToQuantity,
						RatioFormat15Choice.mmQuantityToQuantity, RatioFormat16Choice.mmQuantityToQuantity, RatioFormat5Choice.mmQuantityToQuantity, RatioFormat6Choice.mmQuantityToQuantity, RatioFormat9Choice.mmQuantityToQuantity,
						RatioFormat10Choice.mmQuantityToQuantity, RatioFormat11Choice.mmQuantityToQuantity, RatioFormat12Choice.mmQuantityToQuantity, RatioFormat13Choice.mmQuantityToQuantity, RatioFormat14Choice.mmQuantityToQuantity,
						RatioFormat2Choice.mmQuantityToQuantity, RatioFormat1Choice.mmQuantityToQuantity, RatioFormat19Choice.mmQuantityToQuantity, RatioFormat17Choice.mmQuantityToQuantity, RatioFormat18Choice.mmQuantityToQuantity,
						RatioFormat20Choice.mmQuantityToQuantity, RatioFormat22Choice.mmQuantityToQuantity, RatioFormat24Choice.mmQuantityToQuantity, RatioFormat23Choice.mmQuantityToQuantity, RatioFormat21Choice.mmQuantityToQuantity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmQuantity1,
						com.tools20022.repository.entity.QuantityRatio.mmQuantity2, com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmNewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmNewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmIntermediateSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmwarrant);
				derivationComponent_lazy = () -> Arrays.asList(QuantityToQuantityRatio1.mmObject(), QuantityToQuantityRatio2.mmObject(), LongQuantityToQuantityRatio2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return QuantityRatio.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesProceedsDefinition getAdditionalQuantityForResultantSecuritiesProceedsDefinition() {
		return additionalQuantityForResultantSecuritiesProceedsDefinition;
	}

	public QuantityRatio setAdditionalQuantityForResultantSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition additionalQuantityForResultantSecuritiesProceedsDefinition) {
		this.additionalQuantityForResultantSecuritiesProceedsDefinition = Objects.requireNonNull(additionalQuantityForResultantSecuritiesProceedsDefinition);
		return this;
	}

	public DecimalNumber getQuantity1() {
		return quantity1;
	}

	public QuantityRatio setQuantity1(DecimalNumber quantity1) {
		this.quantity1 = Objects.requireNonNull(quantity1);
		return this;
	}

	public DecimalNumber getQuantity2() {
		return quantity2;
	}

	public QuantityRatio setQuantity2(DecimalNumber quantity2) {
		this.quantity2 = Objects.requireNonNull(quantity2);
		return this;
	}

	public SecuritiesProceedsDefinition getAdditionalQuantityForSubscribedSecuritiesProceedsDefinition() {
		return additionalQuantityForSubscribedSecuritiesProceedsDefinition;
	}

	public QuantityRatio setAdditionalQuantityForSubscribedSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition additionalQuantityForSubscribedSecuritiesProceedsDefinition) {
		this.additionalQuantityForSubscribedSecuritiesProceedsDefinition = Objects.requireNonNull(additionalQuantityForSubscribedSecuritiesProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getNewToOldProceedsDefinition() {
		return newToOldProceedsDefinition;
	}

	public QuantityRatio setNewToOldProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition newToOldProceedsDefinition) {
		this.newToOldProceedsDefinition = Objects.requireNonNull(newToOldProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getNewToUnderlyingProceedsDefinition() {
		return newToUnderlyingProceedsDefinition;
	}

	public QuantityRatio setNewToUnderlyingProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition newToUnderlyingProceedsDefinition) {
		this.newToUnderlyingProceedsDefinition = Objects.requireNonNull(newToUnderlyingProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getIntermediateSecuritiesProceedsDefinition() {
		return intermediateSecuritiesProceedsDefinition;
	}

	public QuantityRatio setIntermediateSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition intermediateSecuritiesProceedsDefinition) {
		this.intermediateSecuritiesProceedsDefinition = Objects.requireNonNull(intermediateSecuritiesProceedsDefinition);
		return this;
	}

	public Warrant getwarrant() {
		return warrant;
	}

	public QuantityRatio setwarrant(com.tools20022.repository.entity.Warrant warrant) {
		this.warrant = Objects.requireNonNull(warrant);
		return this;
	}
}