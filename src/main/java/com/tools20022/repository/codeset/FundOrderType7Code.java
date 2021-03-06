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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FundOrderType7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the fund order type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderType7Code#All
 * FundOrderType7Code.All}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#SecuritiesPurchase
 * FundOrderType7Code.SecuritiesPurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#SecuritiesSale
 * FundOrderType7Code.SecuritiesSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#SwitchFrom
 * FundOrderType7Code.SwitchFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#SwitchTo
 * FundOrderType7Code.SwitchTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#TransferIn
 * FundOrderType7Code.TransferIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#TransferOut
 * FundOrderType7Code.TransferOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#Subscription
 * FundOrderType7Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code#Redemption
 * FundOrderType7Code.Redemption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
 * FundOrderTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the fund order type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOrderType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code All = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.All.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code SecuritiesPurchase = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.SecuritiesPurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code SecuritiesSale = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.SecuritiesSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code SwitchFrom = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFrom";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.SwitchFrom.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code SwitchTo = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchTo";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.SwitchTo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code TransferIn = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIn";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.TransferIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code TransferOut = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOut";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.TransferOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code Subscription = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType7Code
	 * FundOrderType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FundOrderType7Code Redemption = new FundOrderType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType7Code.mmObject();
			codeName = FundOrderTypeCode.Redemption.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundOrderType7Code> codesByName = new LinkedHashMap<>();

	protected FundOrderType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderType7Code";
				definition = "Specifies the fund order type.";
				trace_lazy = () -> FundOrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOrderType7Code.All, com.tools20022.repository.codeset.FundOrderType7Code.SecuritiesPurchase,
						com.tools20022.repository.codeset.FundOrderType7Code.SecuritiesSale, com.tools20022.repository.codeset.FundOrderType7Code.SwitchFrom, com.tools20022.repository.codeset.FundOrderType7Code.SwitchTo,
						com.tools20022.repository.codeset.FundOrderType7Code.TransferIn, com.tools20022.repository.codeset.FundOrderType7Code.TransferOut, com.tools20022.repository.codeset.FundOrderType7Code.Subscription,
						com.tools20022.repository.codeset.FundOrderType7Code.Redemption);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(SecuritiesPurchase.getCodeName().get(), SecuritiesPurchase);
		codesByName.put(SecuritiesSale.getCodeName().get(), SecuritiesSale);
		codesByName.put(SwitchFrom.getCodeName().get(), SwitchFrom);
		codesByName.put(SwitchTo.getCodeName().get(), SwitchTo);
		codesByName.put(TransferIn.getCodeName().get(), TransferIn);
		codesByName.put(TransferOut.getCodeName().get(), TransferOut);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
	}

	public static FundOrderType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOrderType7Code[] values() {
		FundOrderType7Code[] values = new FundOrderType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOrderType7Code> {
		@Override
		public FundOrderType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOrderType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}