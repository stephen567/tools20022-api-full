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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.SecurityCertificate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyAndCertificate2;
import com.tools20022.repository.msg.PartyAndCertificate3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Role played by a party in the context of a security certificate
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecurityCertificatePartyRole"
 * src="doc-files/SecurityCertificatePartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole#mmSecurityCertificate
 * SecurityCertificatePartyRole.mmSecurityCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmSecurityCertificatePartyRole
 * SecurityCertificate.mmSecurityCertificatePartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificateHolderRole
 * SecurityCertificateHolderRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificateIssuerRole
 * SecurityCertificateIssuerRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityCertificatePartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Role played by a party in the context of a security certificate"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecurityCertificatePartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecurityCertificate> securityCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecurityCertificate
	 * SecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmSecurityCertificatePartyRole
	 * SecurityCertificate.mmSecurityCertificatePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndCertificate2#mmCertificate
	 * PartyAndCertificate2.mmCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndCertificate3#mmCertificate
	 * PartyAndCertificate3.mmCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole
	 * SecurityCertificatePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the security certificate for which a party plays a role."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecurityCertificatePartyRole, List<SecurityCertificate>> mmSecurityCertificate = new MMBusinessAssociationEnd<SecurityCertificatePartyRole, List<SecurityCertificate>>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyAndCertificate2.mmCertificate, PartyAndCertificate3.mmCertificate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecurityCertificatePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCertificate";
			definition = "Identifies the security certificate for which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmSecurityCertificatePartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmObject();
		}

		@Override
		public List<SecurityCertificate> getValue(SecurityCertificatePartyRole obj) {
			return obj.getSecurityCertificate();
		}

		@Override
		public void setValue(SecurityCertificatePartyRole obj, List<SecurityCertificate> value) {
			obj.setSecurityCertificate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityCertificatePartyRole";
				definition = "Role played by a party in the context of a security certificate";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecurityCertificate.mmSecurityCertificatePartyRole);
				subType_lazy = () -> Arrays.asList(SecurityCertificateHolderRole.mmObject(), SecurityCertificateIssuerRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecurityCertificatePartyRole.mmSecurityCertificate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecurityCertificatePartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecurityCertificate> getSecurityCertificate() {
		return securityCertificate == null ? securityCertificate = new ArrayList<>() : securityCertificate;
	}

	public SecurityCertificatePartyRole setSecurityCertificate(List<com.tools20022.repository.entity.SecurityCertificate> securityCertificate) {
		this.securityCertificate = Objects.requireNonNull(securityCertificate);
		return this;
	}
}